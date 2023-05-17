package by.tut.Lesson15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Maks", 24);
        Human father = new Human("Vasiliy", 51);
        Human mother = new Human("Inna", 49);
        Human anonim = new Human(null, 50);

        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonim);
        System.out.println(human.getFather().getName());
        if (human.getFather() != null && human.getFather().getFather() != null && human.getFather().getFather().getName() != null) {
            System.out.println(human.getFather().getFather().getName());
        } else {
            System.out.println("unknown name");
        }
        Optional<Human> fatherOpt = Optional.ofNullable(anonim.getFather());
        Optional<Human> notEmpty = Optional.of(human.getFather());
//        if (fatherOpt.isPresent()){
//            System.out.println(fatherOpt.get().getName());
//        }
        fatherOpt.ifPresent(f -> System.out.println(f.getName()));
//        Human possibleFather = fatherOpt.orElseThrow();
//        Human possibleFather = fatherOpt.orElseThrow(() -> new RuntimeException("Here"));
        fatherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()), () -> System.out.println("Anonim"));
        Human protector = new Human("Prot", 100);
        Human ourDef = fatherOpt.orElse(protector);
        Optional.ofNullable(human.getFather()).orElse(getDefHuman());
        Optional.ofNullable(human.getFather()).orElseGet(HumanMain::getDefHuman);
        fatherOpt.map(fath -> fath.getFather())
                .map(fath -> fath.getFather())
                .ifPresent(ded -> System.out.println(ded.getName()));
        Optional.ofNullable(human)
                .map(Human::getFather)
                .filter(f -> f.getName().startsWith("Ab"))
                .ifPresent(f -> System.out.println(f));
    }

    private static Human getDefHuman() {
        System.out.println("This is default human");
        return new Human("Prot", 100);
    }
}

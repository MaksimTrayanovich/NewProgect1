package by.tut.Lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 10, 50, 3);
        List<Integer> val2 = List.of(1, 2, 3);
        List<Integer> emtyList = Collections.emptyList();
        List<Integer> singleList = Collections.singletonList(1);
        Stream<List<Integer>> listStream = Stream.of(values, values, val2);
        Stream<Integer> valuesStream = values.stream();
        Stream<String> stream = Stream.of("A,", "B", "C");
        Stream<String> myRooms = Files.lines(Paths.get("car.doc"));
        Stream<Integer> firstStream = Stream.iterate(0, n -> n + 1);
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(100));

//        List<Integer> result = firstStream
//                .skip(20) //start with after n
//                .limit(30) //limit size
//                .distinct() // remove same type
//                //.peek(x-> System.out.println(x)) //check result stream at this moment
//                .sorted(getIntegerComparator()) //compare object 1 with object 2
//                .filter(val -> val % 2 == 0) //filter any param
//                .map(x -> x * x) //any function
//                .filter(getIntegerPredicate())
//                .collect(Collectors.toList()); //read stream
        //System.out.println(result);
        // List<Integer> secondResult = listStream.flatMap(Collection::stream)
        //.collect(Collectors.toSet());
        // .toList();
        //  System.out.println("second: " + secondResult);
        System.out.println(listStream.flatMap(Collection::stream)
                .filter(x -> x > 3)
                .noneMatch(x -> x % 3 == 0));
        //.allMatch(x->x>1));
        //.anyMatch(x->x>1));

        //.findAny().orElseThrow());
        // .max((o1, o2) -> o1.compareTo(o2)).orElseThrow());
        // .min((o1, o2) -> o1.compareTo(o2)).orElseThrow());
        //  .count());
        firstStream
                .skip(20) //start with after n
                .limit(30) //limit size
                .distinct() // remove same type
                //.peek(x-> System.out.println(x)) //check result stream at this moment
                .sorted(getIntegerComparator()) //compare object 1 with object 2
                .filter(val -> val % 2 == 0) //filter any param
                .map(x -> x * x) //any function
                .filter(getIntegerPredicate())
                .map(x->(long)x)
                .reduce((integer, integer2) -> integer * integer2).ifPresent(x -> System.out.println(x));
        // .forEachOrdered(x-> System.out.println(x));
        // .forEach(x-> System.out.println(x));

    }

    private static Comparator<Integer> getIntegerComparator() {
        return (o1, o2) -> o2.compareTo(o1);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return x -> x < 1000;
    }
}

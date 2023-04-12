package by.tut.Lesson8;

public final class BadParent implements Personable{
    private String name;
    private String nick;

    public String getName() {
        return "This is bad papa: " + name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
            this.nick = name;
        } else {
            this.name = "Anonymous";
            this.nick = name;
        }
    }
}

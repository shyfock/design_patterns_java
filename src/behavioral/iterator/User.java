package behavioral.iterator;

public class User {
    private String name;
    private int age;

    @SuppressWarnings("unused")
    private User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

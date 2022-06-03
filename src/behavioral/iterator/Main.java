package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        users.create(new User("one", 15));
        users.create(new User("two", 18));
        users.create(new User("three", 45));
        users.create(new User("four", 70));
        users.create(new User("five", 22));
        users.create(new User("six", 43));

        while (users.hasMore()) {
            User user = users.next();
            System.out.println("User is: " + user.getName());
        }

        users.create(new User("seven", 52));
        User user = users.next();
        System.out.println("User is: " + user.getName());

        users.reset();
        user = users.next();
        System.out.println("User is: " + user.getName());
    }
}

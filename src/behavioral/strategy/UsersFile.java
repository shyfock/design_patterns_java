package behavioral.strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersFile implements Users {
    private String fileUsers = "users.txt";
    private PrintStream file;

    public UsersFile() {
        try {
            file = new PrintStream(fileUsers);
        } catch (Exception e) {
            System.out.println("Can't open file: " + e.getMessage());
        }
    }

    @Override
    public void create(String name) {
        file.println(name);
    }

    @Override
    public ArrayList<String> listing() {
        ArrayList<String> users = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(fileUsers));
            while (sc.hasNext()) {
                users.add(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
        return users;
    }
}

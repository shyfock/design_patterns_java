package behavioral.strategy;

import java.util.ArrayList;

public class UsersMemory implements Users {
    private ArrayList<String> users = new ArrayList<>();

    @Override
    public void create(String name) {
        users.add(name);
    }

    @Override
    public ArrayList<String> listing() {
        return users;
    }
}

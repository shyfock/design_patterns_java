package behavioral.strategy;

import java.util.ArrayList;

/**
 * El patrón strategy permite ligar a través de una interfaz varias
 * implementaciones que realizan acciones similares con métodos diferentes
 * por medio de un envoltorio.
 * Utilizado comunmente cuando se realizan mockups y se requiere validar
 * distintos modelos con opciones de código diferentes en ejecución.
 */

public class Main {
    public static void main(String[] args) {
        int type = 1; // Selector de clase

        Users users;

        // Switch classes
        if (type == 0) {
            UsersMemory users1 = new UsersMemory();
            users = users1;
        } else {
            UsersFile users1 = new UsersFile();
            users = users1;
        }
        create(users, "fulano");
        create(users, "mengano");
        create(users, "pepe");

        for (String user : listing(users)) {
            System.out.println(user);
        }
    }

    // Wrapper (envoltorio)
    public static void create(Users users, String name) {
        users.create(name);
    }

    public static ArrayList<String> listing(Users users) {
        return users.listing();
    }

}

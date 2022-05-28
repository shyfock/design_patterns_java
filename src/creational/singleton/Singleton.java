package creational.singleton;

/**
 * El patrón de diseño Singleton solo permite una instancia de la clase
 * No se pueden tener mas de una instancia
 * La clase siempre se invoca sobre el mismo stock de memoria
 */
public class Singleton {
    private static Singleton singleton;
    int contador;

    // Constructor privado (escondido)
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}

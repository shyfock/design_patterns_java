package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(20);

        System.out.println("Valor: " + singleton.getContador() + " en memoria: " + singleton);
        System.out.println("Valor: " + singleton2.getContador() + " en memoria: " + singleton2);
    }
}

package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.puertas = 5;
        coche.marca = "Filostro";
        coche.modelo = "Coupe";

        CocheClonar coche2 = new CocheClonar();
        coche2.puertas = 5;
        coche2.marca = "Filostro";
        coche2.modelo = "Coupe";

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        Coche clonado = coche.clonar();
        clonado.puertas = 3;
        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);

        CocheClonar clonado2;
        try {
            clonado2 = coche2.clonar();
            clonado2.puertas = 3;
            System.out.println(clonado2.marca + "\n" + clonado2.modelo + "\n" + clonado2.puertas);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar: " + e.getMessage());
            e.printStackTrace();
        }

    }
}

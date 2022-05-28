package creational.builder;

public class Main {
    public static void main(String[] args) {
        // Vehiculo vehiculo = new Vehiculo();
        // vehiculo.setMarca("Fiat");
        // vehiculo.setMotor("Diesel");
        // vehiculo.setTipo("Combustion");
        // vehiculo.setPuertas(5);
        // }

        Vehiculo coche = new CocheBuilder("Filostros")
                .setPuertas(5)
                .setMotor("Diesel")
                .build();

        System.out.println("Marca: " + coche.getMarca()
                + "\n" + "Motor: " + coche.getMotor()
                + "\n" + "Puertas: " + coche.getPuertas());
    }
}
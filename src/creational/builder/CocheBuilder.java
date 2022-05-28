package creational.builder;

/**
 * El patrón builder permite simplificar la construcción de múltiples
 * objetos con programación fluida
 */
public class CocheBuilder {
    Vehiculo vehiculo;

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.setPuertas(puertas);
        return this;
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.setMotor(motor);
        return this;
    }

    // Método build se crea para hacer wl wrapper (empaquetador)
    public Vehiculo build() {
        return this.vehiculo;
    }
}

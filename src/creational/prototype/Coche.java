package creational.prototype;

public class Coche {
    public String marca;
    public String modelo;
    int puertas;

    public Coche() {
    }

    public Coche clonar() {
        Coche clon = new Coche();

        clon.marca = marca;
        clon.modelo = modelo;
        clon.puertas = puertas;

        return clon;
    }
}

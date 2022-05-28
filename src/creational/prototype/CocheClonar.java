package creational.prototype;

public class CocheClonar implements Cloneable {
    public String marca;
    public String modelo;
    int puertas;

    public CocheClonar() {
    }

    public CocheClonar clonar() throws CloneNotSupportedException {
        return (CocheClonar) this.clone();
    }
}

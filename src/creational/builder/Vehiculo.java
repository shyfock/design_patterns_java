package creational.builder;

public class Vehiculo {
    private String marca;
    private String tipo;
    private String motor;
    private int puertas;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, String motor, int puertas) {
        this.marca = marca;
        this.tipo = tipo;
        this.motor = motor;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}

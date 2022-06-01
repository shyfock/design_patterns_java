package structural.adapter;

public class Lampara implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Lámpara apagada");
    }

    @Override
    public boolean estaEncendido() {
        return false;
    }
}
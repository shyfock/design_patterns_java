package structural.adapter;

/**
 * El patron adapter permite adaptar clases a nuevas librerias
 * Permite utilizar codigo con librerias actualizadas adaptándolo
 * a la actualización de código.
 */

public class PowerAdapter implements Enchufable {

    public LightBulb lightBulb = new LightBulb();

    @Override
    public void enciende() {
        lightBulb.turnOn(110);

    }

    @Override
    public void apaga() {
        lightBulb.turnOff();

    }

    @Override
    public boolean estaEncendido() {
        return lightBulb.isPoweredOn();
    }

}

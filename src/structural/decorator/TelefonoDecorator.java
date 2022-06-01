package structural.decorator;

/**
 * El patrón Decorator mejora una clase sin tocar o modificar la clase original
 */

public class TelefonoDecorator implements Telefono {
    private Telefono telefono;

    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();

    }

}

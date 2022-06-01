package structural.decorator;

public class TelefonoNextGen extends TelefonoDecorator {
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("   -> nextGen: Tengo también 5G");
        System.out.println("   -> nextGen: Tengo también VoLTE");
    }
}
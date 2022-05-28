package creational.factory;

/**
 * El patrón Factory permite empaquetar o condensar varias clases
 * en una sola por medio de una interfaz. Las clases se instancian
 * a través de la clase factoria. El constructor por defecto se
 * esconde (se vuelve private) y solo se permite instanciar con un
 * parámetro que vincula las clases dependientes de la interface.
 */
public class PrecioFactory {

    Precio precio;

    @SuppressWarnings("unused")
    private PrecioFactory() {
    }

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            System.out.println("España, precio en EUR");
            precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("UK")) {
            System.out.println("Estamos en UK, precio en GBP");
            precio = new PrecioGBP();
        } else {
            System.out.println("Otro pais, precio en EUR");
            precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}

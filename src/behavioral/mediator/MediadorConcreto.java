package behavioral.mediator;

import java.util.ArrayList;

/**
 * El patrón mediator permite entrelazar o cumunicar un conjunto de clases
 * que pueden ser dependientes entre si sin tener la necesidad de tener una
 * misma clase envolvente que las contenga.
 * Se logra a través de la implementación de una clase abstracta que trabaja
 * como intermediario entre las clases. Esta clase abstracta recibe y entrega
 * información entre las clases sin que ellas se conecten directamente. Cuando
 * una clase envía las demás reciben, excepto la misma clase, todo a través
 * del mediador. Una clase genera un evento y las demás reaccionan, pero la
 * comunicación entre ellas siempre es a través del mediador. No hay
 * dependencias concretas entre las clases.
 * Utilizado principalmente en instancias de usuario.
 */

public class MediadorConcreto extends Mediator {

    ArrayList<Colega> colegas = new ArrayList<>();

    @Override
    void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    void reenvia(Colega colega) {
        for (Colega actual : colegas) {
            if (!actual.equals(colega)) {
                actual.recibe();
            }
        }
    }
}

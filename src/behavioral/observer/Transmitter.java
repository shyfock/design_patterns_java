package behavioral.observer;

import java.util.ArrayList;

/**
 * Patrón observer, también llamdo pubsub (public subscription).
 * Cuando se crea un nuevo receptor se se notifica a los demás.
 * Puede ser útil para envío de notificaciones por varios sistemas.
 */

public class Transmitter {
    private ArrayList<Receiver> receiver = new ArrayList<>();

    public void createReceiver(Receiver receiver) {
        this.receiver.add(receiver);
    }

    public void transmit() {
        for (Receiver receiver : receiver) {
            receiver.receives();
        }
    }
}

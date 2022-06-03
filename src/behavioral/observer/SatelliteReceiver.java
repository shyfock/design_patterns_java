package behavioral.observer;

public class SatelliteReceiver implements Receiver {

    @Override
    public void receives() {
        System.out.println("Signal received on satellite.");
    }

}

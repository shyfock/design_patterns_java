package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Transmitter transmitter = new Transmitter();

        TVReceiver tv = new TVReceiver();

        RadioReceiver radio = new RadioReceiver();

        SatelliteReceiver satellite = new SatelliteReceiver();

        transmitter.createReceiver(tv);
        transmitter.createReceiver(radio);
        transmitter.createReceiver(satellite);

        transmitter.transmit();
    }
}

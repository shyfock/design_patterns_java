package behavioral.observer;

public class RadioReceiver implements Receiver {

    @Override
    public void receives() {
        System.out.println("Signal received on radio");
    }

}

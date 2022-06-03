package behavioral.observer;

public class TVReceiver implements Receiver {

    @Override
    public void receives() {
        System.out.println("Signal received on TV");
    }
}

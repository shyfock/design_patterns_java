package structural.adapter;

public class LightBulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("LightBulb is powered ON, with " + voltage + " of voltage");
    }

    public void turnOff() {
        poweredOn = false;
        voltage = 0;
        System.out.println("LightBulb is powered OFF");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}

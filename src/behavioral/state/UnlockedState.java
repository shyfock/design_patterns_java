package behavioral.state;

public class UnlockedState extends State {
    public UnlockedState(Telephone telephone) {
        super(telephone);
    }

    @Override
    public String unlock() {
        return "unlock(): Phone was unlocked yet";
    }

    @Override
    public String openCamera() {
        telephone.stateChange(new OpenCameraState(telephone));
        return "openCamera(): Opened Camera, you can take a picture";
    }

    @Override
    public String takePicture() {
        return "takePicture(): Can't take a picture without openning camera";
    }
}

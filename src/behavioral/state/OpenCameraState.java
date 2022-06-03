package behavioral.state;

public class OpenCameraState extends State {
    public OpenCameraState(Telephone telephone) {
        super(telephone);
    }

    @Override
    public String unlock() {
        return "unlock(): PHONE WAS UNLOCKED YET!!!";
    }

    @Override
    public String openCamera() {
        return "openCamera(): CAMERA WAS OPENED YET!!!";
    }

    @Override
    public String takePicture() {
        telephone.stateChange(new TakePictureState(telephone));
        return "takePicture(): You can take a picture now...";
    }

}

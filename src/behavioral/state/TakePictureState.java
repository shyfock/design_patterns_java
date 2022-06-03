package behavioral.state;

public class TakePictureState extends State {
    public TakePictureState(Telephone telephone) {
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
        // telephone.stateChange(new LockedState(telephone));
        return "Picture has been taken!!!";
    }
}

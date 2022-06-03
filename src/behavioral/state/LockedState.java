package behavioral.state;

public class LockedState extends State {

    public LockedState(Telephone telephone) {
        super(telephone);
    }

    @Override
    public String unlock() {
        telephone.stateChange(new UnlockedState(telephone));
        return "unlock(): Phone has been unlocked";
    }

    @Override
    public String openCamera() {
        return "openCamera(): Camera locked, first unlock your phone";
    }

    @Override
    public String takePicture() {
        return "takePicture(): Camera locked, first unlock your phone";
    }
}

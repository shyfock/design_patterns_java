package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Telephone phone1 = new Telephone();

        // System.out.println(phone1.state.openCamera());
        System.out.println(phone1.state.unlock());
        System.out.println(phone1.state.openCamera());
        System.out.println(phone1.state.takePicture());
    }
}

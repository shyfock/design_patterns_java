package example;

public class Main {
    public static void main(String[] args) {
        UserSession userSession = UserSession.getInstance();
        userSession.setUserName("user1");
        userSession.startSession(userSession);
        // UserSession userSession2 = UserSession.getInstance();
        // userSession2.setUserName("user2");
        userSession.endSession();
        System.out.println("User: " + userSession.getUserName() + " in stock " + userSession);
        // System.out.println("User: " + userSession2.getUserName() + " in stock " +
        // userSession2);
    }
}

package example;

public class UserSession {
    private static UserSession userSession;
    String userName;

    private UserSession() {
    }

    void startSession(UserSession userSession) {
        UserSession.userSession = userSession;
        System.out.println("Session started for user: " + userSession.userName);
    }

    void endSession() {
        userSession = null;
        System.out.println("Session ended");
    }

    public static UserSession getInstance() {
        if (userSession == null) {
            userSession = new UserSession();
        }
        return userSession;
    }

    public static void setUserSession(UserSession usersession) {
        UserSession.userSession = usersession;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

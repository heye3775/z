public class Constants {
    public static final double PI = 3.14159;
    public static final String APP_NAME = "MyApplication";
    public static final String VERSION = "1.0.0";
    public static final int MAX_USERS = 1000;
}

class Main {
    public static void main(String[] args) {
        System.out.println("App: " + Constants.APP_NAME);
        System.out.println("Version: " + Constants.VERSION);
        System.out.println("PI: " + Constants.PI);
        System.out.println("Max Users: " + Constants.MAX_USERS);
    }
}

package demo;

public class SmartHome {
    private static SmartHome INSTANCE;

    private SmartHome() {
    }

    public static SmartHome getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SmartHome();
        } else{
            System.out.println("instance can only be created once");
        }

        return INSTANCE;
    }
}

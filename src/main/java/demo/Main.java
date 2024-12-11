package demo;

public class Main {
    public static void main(String[] args) {
        App app = App.getInstance();
        User hala = new User("1", "hala");
        User charlie = new User("2", "charlie");

        hala.login(app);
        System.out.println(hala);
        charlie.login(app);

        // HOW CAN hala SEND "Hello World" to charlie?

    }
}

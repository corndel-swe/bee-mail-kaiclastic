package demo;

import java.util.ArrayList;
import java.util.List;

public class App implements Mediator{
    private static App instance;

    private List<User> users = new ArrayList<>();

    public static App getInstance() {
       if(instance == null){
           instance = new App();
       } else {
           System.out.println("Already exists");
       }
        return instance;
    }

    @Override
    public void addUser(User user){
        users.add(user);
        user.setMediator(this);
        System.out.println("user" + user.getUsername() + " was added");
    }

    @Override
    public void addUser(List<User> users) {
        this.users.addAll(users);
        users.forEach(user -> user.setMediator(this));
    }

    @Override
    public void findUser( String userId){
        // WILL NEED TO RETURN USER BY ID
    }


    @Override
    public void deliverMessage(String senderId,  String recipientId, String content ){
        // FIND THE SENDER
        // FIND THE RECIPIENT
        // CREATE A MESSAGE
        // DELIVERY IT TO THE RECIPIENT
    }

}

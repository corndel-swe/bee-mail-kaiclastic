package demo;

import java.util.Arrays;

public  class User {
    protected String id;
   protected String username;
    private Message[] inbox;
    private App app;
 protected Mediator mediator;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", inbox=" + Arrays.toString(inbox) +
                ", app=" + app +
                ", mediator=" + mediator +
                '}';
    }

    public void login(App app) {

    }

    public void sendMessage(String recipientId, String content) {

    }

    public void receiveMessage(Message message) {

    }

    public void readMessage(int idx) {

    }
 public  void setMediator(Mediator mediator) {
  this.mediator = mediator;
 }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return username;
    }
}

package demo;

import java.util.List;

public interface Mediator {
    void addUser(User user);
    void addUser(List<User> users);
    void findUser(String userId);
    void deliverMessage(String senderId,  String recipientId, String content);
}

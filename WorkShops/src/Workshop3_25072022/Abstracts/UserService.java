package Workshop3_25072022.Abstracts;

import Workshop3_25072022.Entities.User;

public interface UserService {
    void register(User user);
    void sendNotification(User user,String message);
    void forgetPassword(User user);
}

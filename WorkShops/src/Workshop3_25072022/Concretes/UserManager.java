package Workshop3_25072022.Concretes;

import Workshop3_25072022.Abstracts.LoggerService;
import Workshop3_25072022.Abstracts.UserService;
import Workshop3_25072022.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    private List<LoggerService> loggerServices;
    List<User> users = new ArrayList<User>();
    public UserManager(List<LoggerService> loggerServices) {
        this.loggerServices = loggerServices;
    }


    @Override
    public void register(User user) {
        users.add(user);
        sendNotification(user, user.getFirstName()+" registered successfully");
    }

    @Override
    public void sendNotification(User user,String message) {
        for (LoggerService item:loggerServices) {
            item.log(message);
        }
    }

    @Override
    public void forgetPassword(User user) {
        if (users.contains(user))
        {
            sendNotification(user,user.getEmail()+" your password has been reset");
        }
        else
        {
            System.out.println("Wrong User!");
        }
    }

}

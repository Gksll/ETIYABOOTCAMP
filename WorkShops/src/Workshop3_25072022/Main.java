package Workshop3_25072022;


import Workshop3_25072022.Abstracts.LoggerService;
import Workshop3_25072022.Concretes.EmailLoggerManager;
import Workshop3_25072022.Concretes.SmsLoggerManager;
import Workshop3_25072022.Concretes.UserManager;
import Workshop3_25072022.Entities.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        User user = new User();
        user.setId(1);
        user.setFirstName("Göksel");
        user.setLastName("Doğan");
        user.setPassword("123456");
        user.setEmail("g_dogan_12@hotmail.com");

        List<LoggerService> services = new ArrayList<LoggerService>();
        services.add(new EmailLoggerManager());
        services.add(new SmsLoggerManager());

        UserManager userManager = new UserManager(services);
        userManager.register(user);
        userManager.forgetPassword(user);
    }
}

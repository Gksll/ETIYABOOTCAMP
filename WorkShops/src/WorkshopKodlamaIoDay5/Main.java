package WorkshopKodlamaIoDay5;

import WorkshopKodlamaIoDay5.Concretes.UserManager;
import WorkshopKodlamaIoDay5.Entities.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setFirstName("Göksel");
        user.setLastName("Doğan");
        user.setPassword("123456");
        user.setEmail("g_dogan_12@hotmail.com");
        UserManager userManager = new UserManager();
//        userManager.addUser(user);
        userManager.verifyMail(user.getEmail(),true);
        userManager.Login(user);

//        User user2 = new User();
//        user2.setId(2);
//        user2.setFirstName("Görkem");
//        user2.setLastName("Doğan");
//        user2.setPassword("123456");
//        user2.setEmail("g_dogan_16@hotmail.com");
//
//        userManager.addUser(user2);
//        userManager.verifyMail(user2.getEmail(), true);
//        userManager.Login(user);
    }
}

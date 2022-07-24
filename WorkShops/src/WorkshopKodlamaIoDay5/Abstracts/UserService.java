package WorkshopKodlamaIoDay5.Abstracts;

import WorkshopKodlamaIoDay5.Entities.GoogleUser;
import WorkshopKodlamaIoDay5.Entities.User;

public interface UserService {
    boolean addUser(User user);
    boolean addUserWithGoogle(GoogleUser googleUser);
    void sendEmail(String email);
    boolean verifyMail(String email,boolean checked);

    boolean Login(User user);
}

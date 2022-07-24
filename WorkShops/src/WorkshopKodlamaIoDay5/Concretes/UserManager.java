package WorkshopKodlamaIoDay5.Concretes;

import WorkshopKodlamaIoDay5.Abstracts.UserService;
import WorkshopKodlamaIoDay5.Entities.GoogleUser;
import WorkshopKodlamaIoDay5.Entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class UserManager implements UserService {
    List<User> userList;
    private googleUserAdapter googleAdapter;

    public UserManager() {

        this.userList = new ArrayList<User>();
    }

    public UserManager(googleUserAdapter googleAdapter) {
        this.googleAdapter = googleAdapter;
    }

    @Override
    public boolean addUser(User user) {
        if (checkPasswordLenght(user.getPassword()) && mainUserInformationCheck(user)
                && isEmailValid(user.getEmail()) && checkEmailExists(user.getEmail())
                && checkFirstAndLastNameLenght(user.getFirstName(), user.getLastName())
        ) {
            sendEmail(user.getEmail());
            System.out.println("Check mail box, You must verify your e-mail address");
            userList.add(user);
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }

    @Override
    public boolean addUserWithGoogle(GoogleUser googleUser) {
        boolean result = addUser(googleAdapter.verifyWithGoogle(googleUser));
        if (result) {
            System.out.println("Person has successfully registered with google information");
            return true;
        } else {
            System.out.println("Person cannot add with google information");
            return false;
        }
    }


    @Override
    public void sendEmail(String email) {
        System.out.println(" A confirmation message has been sent to " + email);
    }

    @Override
    public boolean verifyMail(String email, boolean checked) {
        if (checked) {
            System.out.println("Email address has been verified " + email);
            return true;
        } else {
            System.out.println("You must verify your e-mail address!");
            return false;
        }

    }

    @Override
    public boolean Login(User user) {
        if (checkEmailAndPassword(user.getEmail(),user.getPassword()))
        {
            for (User item:userList) {
                if (item.getEmail()==user.getEmail() && item.getPassword()==user.getPassword())
                {
                    System.out.println("logged in successfully");
                    return true;
                }
                else
                {
                    System.out.println("Username or password incorrect");
                    return false;
                }
            }
        }
        System.out.println("Login failed");
        return false;
    }

    private boolean checkPasswordLenght(String password) {
        if (password.length() < 6) {
            System.out.println("Password Lenght must grather then 6");
            return false;
        } else {
            return true;
        }
    }

    private boolean mainUserInformationCheck(User user) {
        if (user.getFirstName() == null && user.getFirstName() == "") {
            System.out.println("check first name!");
            return false;
        } else if (user.getLastName() == null && user.getLastName() == "") {
            System.out.println("Check last name!");
            return false;
        } else if (user.getPassword() == null && user.getPassword() == "") {
            System.out.println("Check Password!");
            return false;
        }
        return true;
    }

    private boolean isEmailValid(String email) {
        final Pattern emailRegex = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        if (emailRegex.matcher(email).matches()) {
            return true;
        } else {
            System.out.println("Invalid Email! Check mail characters!");
            return false;
        }
    }

    private boolean checkEmailExists(String email) {
        boolean exists = true;
        for (User item : userList) {
            if (item.getEmail() == email) {
                System.out.println("Email already using! ");
                exists = false;
            }
        }
        return exists;
    }

    private boolean checkFirstAndLastNameLenght(String firstName, String lastName) {
        if (firstName.length() < 2 || lastName.length() < 2) {
            System.out.println("Name or Last name must grather than 2 characters");
            return false;
        } else {
            return true;
        }
    }

    private boolean checkEmailAndPassword(String email, String password)
    {
        if ((email.length()==0 ||email==null) && (password.length()==0 ||password==null))
        {
            System.out.println("Username or password Not Null!");
            return false;
        }
        else
        {
            return true;
        }
    }
}

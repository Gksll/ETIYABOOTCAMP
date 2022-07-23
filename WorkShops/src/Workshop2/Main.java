package Workshop2;

public class Main {

    public static void main(String[] args)
    {
        User user1 = new User();
        user1.setFirstName("Goksel");
        BaseService manager = new UserManager();
        manager.add(user1);
    }
}

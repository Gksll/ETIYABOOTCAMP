package Workshop2;

public class UserManager implements UserService{
    @Override
    public void add(User item) {
        System.out.println(item.getFirstName()+" added");
    }

    @Override
    public void update(User item) {
        System.out.println(item.getFirstName()+" updated");
    }

    @Override
    public void delete(User item) {
        System.out.println(item.getFirstName()+" deleted");
    }

    @Override
    public void get(User item) {
        System.out.println(item.getFirstName()+" listed");
    }
}

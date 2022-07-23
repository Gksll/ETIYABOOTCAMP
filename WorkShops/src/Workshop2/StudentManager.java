package Workshop2;

public class StudentManager implements StudentService{
    @Override
    public void add(Student item) {
        System.out.println(item.getFirstName()+" added");
    }

    @Override
    public void update(Student item) {
        System.out.println(item.getFirstName()+" updated");
    }

    @Override
    public void delete(Student item) {
        System.out.println(item.getFirstName()+" deleted");
    }

    @Override
    public void get(Student item) {
        System.out.println(item.getFirstName()+" listed");
    }
}

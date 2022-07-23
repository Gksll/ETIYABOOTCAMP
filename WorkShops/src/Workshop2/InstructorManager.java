package Workshop2;

public class InstructorManager implements InstructorService{
    @Override
    public void add(Instructor item) {
        System.out.println(item.getFirstName()+" added");
    }

    @Override
    public void update(Instructor item) {
        System.out.println(item.getFirstName()+" updated");
    }

    @Override
    public void delete(Instructor item) {
        System.out.println(item.getFirstName()+" deleted");
    }

    @Override
    public void get(Instructor item) {
        System.out.println(item.getFirstName()+" listed");
    }
}

package GamePlatform.Entities;

public class Campaign {
    private int id;
    private String name;
    private double discontinued;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(double discontinued) {
        this.discontinued = discontinued;
    }
}

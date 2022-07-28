package TelcoProject.Entities;

public class Invoice {
    private int id;

    public Invoice(int id, Subscription subcription, String description) {
        this.id = id;
        this.subcription = subcription;
        this.description = description;
    }
    private Subscription subcription;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subscription getSubcription() {
        return subcription;
    }

    public void setSubcription(Subscription subcription) {
        this.subcription = subcription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

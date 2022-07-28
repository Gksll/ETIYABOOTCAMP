package TelcoProject.Entities;

public class AddressType {
    public AddressType(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }



    private int id;
    private String type;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

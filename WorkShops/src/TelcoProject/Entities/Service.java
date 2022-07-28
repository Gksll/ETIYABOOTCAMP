package TelcoProject.Entities;

public class Service {
    public Service(int id, Product product, String name, String description, Package aPackage) {
        this.id = id;
        this.product = product;
        this.name = name;
        this.description = description;
        this.aPackage=aPackage;
    }

    private int id;
    private Product product;
    private Package aPackage;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Package getAPackage() {
        return aPackage;
    }

    public void setAPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}

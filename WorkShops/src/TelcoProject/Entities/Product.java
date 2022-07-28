package TelcoProject.Entities;

public class Product {
    public Product(int id, String productName, String serialNumber, String cableType, String cableLenght) {
        this.id = id;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.cableType = cableType;
        this.cableLenght = cableLenght;
    }

    private int id;
    private String productName;
    private String serialNumber;
    private String cableType;
    private String cableLenght;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getCableLenght() {
        return cableLenght;
    }

    public void setCableLenght(String cableLenght) {
        this.cableLenght = cableLenght;
    }
}

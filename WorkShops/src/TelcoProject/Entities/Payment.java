package TelcoProject.Entities;

public class Payment {
    public Payment(int id, PayType payType, Invoice invoice, String description) {
        this.id = id;
        this.payType = payType;
        this.invoice = invoice;
        this.description = description;
    }

    private int id;
    private PayType payType;

    private Invoice invoice;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

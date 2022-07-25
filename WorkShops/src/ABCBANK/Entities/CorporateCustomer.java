package ABCBANK.Entities;

public class CorporateCustomer extends Customer{
    public CorporateCustomer(Channel channel) {
        super(channel);
    }
    private String title;
    private String tax_number;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTax_number() {
        return tax_number;
    }

    public void setTax_number(String tax_number) {
        this.tax_number = tax_number;
    }
}

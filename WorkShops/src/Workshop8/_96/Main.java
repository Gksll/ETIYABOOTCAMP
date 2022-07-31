package Workshop8._96;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager();
        Customer customer1 = new Customer();
        customer1.cityId=26;
        customer1.firstName="Göksel";
        customer1.lastName="Doğan";
        customer1.identityNumber="1231312312333";
        customerManager.Add(customer1);

    }
}
class CustomerManager {
    public void Add(Customer customer) {
        if (checkCustomerNull(customer))
            System.out.println(customer.firstName + " Eklendi");
        else
            System.out.println("eklenemedi!");
    }
    private boolean checkCustomerNull(Customer customer)
    {
        if (customer.firstName==null || customer.lastName==null || customer.identityNumber==null || customer.cityId==0)
            return false;

    return true;
    }
}

class Customer
{
    public String firstName;
    public String lastName;
    public String identityNumber ;
    public int cityId;
}

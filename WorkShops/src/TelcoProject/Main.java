package TelcoProject;

import TelcoProject.Entities.*;
import TelcoProject.Entities.Package;

import java.sql.Date;

public class Main {

    public static void main(String[] args)
    {
        Customer customer1 = new Customer(1,"110401");
        AddressType addressType1= new AddressType(1,"Ev adresi","Siparişler için belirtilen adres türlerinden bir tanesidir.");
        Address address1 = new Address(1,addressType1,"Eskişehir","Türkiye","26000","gokmeydan");
        CustomerAddress customerAddress1 = new CustomerAddress(1,customer1,address1);
        IndividualCustomer individualCustomer1 = new IndividualCustomer(2,"123321","göksel","doğan","210123123123");
        CorporateCustomer corporateCustomer1 = new CorporateCustomer(2,"310401","X fiması","12222");
        CorporateCustomer corporateCustomer2 = new CorporateCustomer(2,"310401","X fiması","12222");

        PayType payType1 = new PayType(1,"kredi kartı","ödeme Garanti kredi kartı ile yapılmıştır.");
        Package package1 = new Package(1,"Fiber paketi",99.99);
        Product product1 = new Product(1,"modem","12312","cat6","30 metre");
        Service service1 = new Service(1,product1,"Tv hzmeti","Tv ek paketlerini içerir",package1);
        Subscription subscription1 = new Subscription(1,customer1,service1,address1, Date.valueOf("25-05-2018"),Date.valueOf("25-05-2018"));
        Invoice invoice1 = new Invoice(1,subscription1,"fatura detayları bla bla bla");
        Payment payment1 = new Payment(1,payType1,invoice1,"ödeme yapıldı");
        System.out.println(Customer.getCount());
    }


}

package ABCBANK;

import ABCBANK.Entities.*;

import java.sql.Date;

public class Main {
    public static void main(String[] args)
    {
        Channel channel1 = new Channel();
        channel1.setId(1);
        channel1.setChannelName("Digital Banking");
        channel1.setChannelDescription("Digital banking is part of the broader context for the move to online banking, where banking services are delivered over the internet. ");

        Customer customer1 = new Customer(channel1);
        customer1.setId(1);
        customer1.setCustomerNumber("563123");

        IndividualCustomer customer2 = new IndividualCustomer(channel1);
        customer2.setCustomerNumber("123123");
        customer2.setId(2);
        customer2.setFirstName("Göksel");
        customer2.setLastName("Doğan");
        customer2.setIdentityNumber("222222222222");

        CorporateCustomer customer3 = new CorporateCustomer(channel1);
        customer3.setId(3);
        customer3.setCustomerNumber("12312321");
        customer3.setTax_number("555123");
        customer3.setTitle("Trial");

        BalanceSheet balance1 = new BalanceSheet(customer1);
        balance1.setId(1);
        balance1.setDate( Date.valueOf("05/07/2019"));
        balance1.setTotalPrice(99.999);

        CommercialActivity commercialActivity1 = new CommercialActivity(customer2);
        commercialActivity1.setId(1);
        commercialActivity1.setStartingDate(Date.valueOf("05/07/2019"));

        Address address1 = new Address();
        address1.setId(1);
        address1.setAddressDetails("trail trial much more trial");
        address1.setCity("any city");
        address1.setCountry("World");
        address1.setState("actually we have neighbours not  state!");
        address1.setPostalCode("just a numbers :)");

        CustomerAddress customerAddress1 = new CustomerAddress(1,customer1,address1);
        customerAddress1.setId(1);
    }
}

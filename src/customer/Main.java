package customer;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("05311515321");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ece");
        individualCustomer.setLastName("Türkay");

        CoorporateCustomer coorporateCustomer =new CoorporateCustomer();
        coorporateCustomer.setId(2);
        coorporateCustomer.setCompanyName("kodlama.io");
        coorporateCustomer.setPhoneNumber("05231343");
        coorporateCustomer.setTaxNumber("11111111");
        coorporateCustomer.setCustomerNumber("54321");

         Customer[] customers = {individualCustomer, coorporateCustomer};
         //Customer sınıfı base class'tır. Diğer classların atasıdır.(inheritance)
        //biz bireysel ve cooporate'i de customer yaptık.

    }
}

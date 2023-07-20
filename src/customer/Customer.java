package customer;

public class Customer {

    /*
    Hem bireysel hem de kurumsal müşteri için aynı olan özellikler
     */

    private int id;
    private String customerNumber; //üzerinde matematiksel işlem yapmadığın sayılar String yazılır. TC no gibi
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package customer;

public class IndividualCustomer extends Customer {

    //individual customer is an extesion of the customer class
    //yani birseysel müşteri bir müşteridir (individual customer is a customer denilir)

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

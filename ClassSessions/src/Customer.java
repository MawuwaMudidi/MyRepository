
import java.util.Objects;

class Customer extends Person {

    private static int customerID;
    private double balance;

    public Customer(String name, int age, String username, String password, double balance) {
        super(name, age, username, password);
        this.customerID = (int) (1000000 * Math.random());
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public int getCustomerID() {

        return customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return super.equals(o) ||
                (customerID == Customer.customerID && password.equals(customer.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCustomerID());
    }
}





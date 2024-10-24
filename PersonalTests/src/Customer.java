public class Customer {
    private String customerID;
    private String name;
    private int age;

    public Customer(String customerID, String name, int age) {
        this.customerID = customerID;
        this.name = name;
        this.age = age;
    }

    public String getCustomerID(){
        return this.customerID;
    }
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

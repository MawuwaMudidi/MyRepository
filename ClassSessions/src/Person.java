import java.util.Objects;

public class Person {
    //Create Person class, it should have name, age, username, password.
    //Override toString function to just print name and age in a good format.
    //Override equals function to check username and password.
    protected String name;
    protected int age;
    protected String username;
    protected String password;

    public Person(String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age;}

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) { this.password = password;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
//Create Customer class, it should extend Person  class and it should have extra customerID
// (auto genarate we will not have it on constructor) and balance.
//Required extra functions: getBalance, setBalance and getCustomerID
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or
// customerID and password match.  IF any of cases are correct we will return true.

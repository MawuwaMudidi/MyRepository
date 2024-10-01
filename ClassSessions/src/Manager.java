import java.util.Objects;

class Manager extends Person{

    private int managerID;
    private int actionNumber;

    public Manager(String name, int age, String username, String password) {
        super(name, age, username, password);
        this.managerID = (int) (1000000 * Math.random());
        this.actionNumber = 0;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) ||
                (managerID == manager.managerID && password.equals(manager.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getManagerID());
    }
}

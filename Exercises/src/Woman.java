class Woman extends Person {

    // Constructor
    public Woman(String name, int age) {
        super(name, age);
    }

    // Implement abstract method
    @Override
    public void printNameandType() {
        System.out.println(getName() + " is a woman, Age: " + getAge());
    }

    @Override
    public void work() {
        System.out.println(getName() + " does not have a work.");
    }

}

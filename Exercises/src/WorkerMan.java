class WorkerMan extends Man {
    private int workingHours;
    // Constructor
    public WorkerMan(String name, int age, int workingHours) {
        super(name, age);
        this.workingHours = workingHours;
    }

    // Override displayRole to include work info
    @Override
    public void printNameandType() {
        System.out.println(getName() + " is a worker man, Age: " + getAge());
    }

    @Override
    public void work() {
        System.out.println(getName() + " worked " + workingHours + " hours.");
    }
}

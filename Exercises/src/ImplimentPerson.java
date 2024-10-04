public class ImplimentPerson {
    public static void main(String[] args) {
        // Create instances of Man, WorkerMan, Woman, WorkerWoman
        Person person1 = new Man("Jeremie", 25);
        Person person2 = new WorkerMan("James", 35,2);

        Person person3 = new Woman("Alice", 28);
        Person person4 = new WorkerWoman("Sophia", 32,3);

        Person person5 = new Man("David", 40);
        Person person6 = new WorkerMan("Michael", 45,8);

        Person person7 = new Woman("Hana", 26);
        Person person8 = new WorkerWoman("Maria", 29,7);

            // Display their roles
            person1.printNameandType();
            person2.printNameandType();
            person3.printNameandType();
            person4.printNameandType();
            person5.printNameandType();
            person6.printNameandType();
            person7.printNameandType();
            person8.printNameandType();

            // Call the work() method if the object is a WorkerMan or WorkerWoman
            person1.work();
            person2.work();
            person3.work();
            person4.work();
            person5.work();
            person6.work();
            person7.work();
            person8.work();
        }
    }
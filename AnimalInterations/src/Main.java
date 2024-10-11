//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Interact with the dog
        System.out.println("--- Dog interactions ---");
        dog.feed("bones");
        dog.play();
        dog.bark();
        dog.sleep(6);
        dog.showInteractionHistory();

        System.out.println(); // Separate outputs

        // Interact with the cat
        System.out.println("--- Cat interactions ---");
        cat.feed("fish");
        cat.play();
        cat.meow();
        cat.sleep(8);
        cat.showInteractionHistory();
    }
}

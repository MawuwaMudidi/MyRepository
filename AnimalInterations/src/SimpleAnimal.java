import java.util.List;
import java.util.ArrayList;

public class SimpleAnimal implements AnimalInteraction{

    private List<String> interactionHistory = new ArrayList<>();

    public SimpleAnimal() {
       List<String > interactionHistory = new ArrayList<>();
    }
    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with: " + food);
        System.out.println("Fed the animal with: " + food);
    }

    @Override
    public void play() {
        interactionHistory.add("Played with the animal.");
        System.out.println("Played with the animal.");
    }

    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction History:");
        for (String interaction : interactionHistory) {
            System.out.println(interaction);
        }
    }

    @Override
    public void sleep(int hours) {
        interactionHistory.add("Slept for " + hours + " hours.");
        System.out.println("Slept for " + hours + " hours.");
    }
}

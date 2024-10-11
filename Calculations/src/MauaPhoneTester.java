import java.util.Scanner;

class MauaPhone extends SimplePhone {
    private Scanner scanner;
    public MauaPhone() {
        super();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void call(String contact) {
        System.out.println("Who do you want to call? ");
        String calledContact = scanner.nextLine();
        callHistory.add("Called: " + calledContact);
        System.out.println("Calling " + calledContact + "...");
    }

    @Override
    public void text(String contact, String message) {
        System.out.println("Who do you want to text? ");
        String textContact = scanner.nextLine();
        System.out.println("What is your message? ");
        String textMessage = scanner.nextLine();
        textHistory.add("Text to " + textContact + ": " + textMessage);
        System.out.println("Sending text to " + textContact + ": " + textMessage);
    }
}
public class MauaPhoneTester{
    public static void  main(String [] args){

        MauaPhone myphone = new MauaPhone();

        myphone.call(" ");
        myphone.text(" ", " ");

        myphone.showCallHistory();
        myphone.showTextHistory();

    }
}


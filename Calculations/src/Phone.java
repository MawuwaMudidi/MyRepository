import java.util.ArrayList;

interface Phone {
    /*
    Create Interface and implement it via abstract class
-> Create Phone Interface, it should have call, text, showCallHistory and showTextHistoryfunctions.
-> Create SimplePhone abstract classes and implement those functions.
When you use call function it should ask who you want to
call then should store it, if you text it should ask your text message and
who you text with.
-> Create YourNamePhone(HuseyinPhone) and inherit the SimplePhone and test your codes.
NOTE: You can add related information or some necessary information to your classes.
     */
    public void  call(String contact);
    public void text(String contact, String message);
    public void showCallHistory();
    public void showTextHistory();

}
abstract class SimplePhone implements Phone {
    protected ArrayList<String> callHistory;
    protected ArrayList<String> textHistory;

    public SimplePhone(String name, String number) {
        this.callHistory = new ArrayList<>();
        this.textHistory = new ArrayList<>();
    }

    public SimplePhone() {

    }

    public void showCallHistory() {
        if (callHistory.isEmpty()) {
            System.out.println("No call history available.");
        } else {
            System.out.println("Call History:");
            for (String call : callHistory) {
                System.out.println(call);
            }
        }
    }
    public void showTextHistory() {
        if (textHistory.isEmpty()) {
            System.out.println("No text history available.");
        } else {
            System.out.println("Text history:");
            for (String text : textHistory) {
                System.out.println(text);
            }
        }

    }
    }



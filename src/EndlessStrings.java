import java.util.Scanner;

public class EndlessStrings {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String userInput = null;

        System.out.println("Please enter an object in your living room: ");
        userInput = keyboard.next();


        while(userInput != null){
            System.out.println("In my living room is a " + userInput);
            System.out.println("What a lovely " + userInput + "\nGive me another object in your living room: ");
            userInput = keyboard.next();



        }
        System.out.println("Such nice furnishings!");
        keyboard.close();



    }
}

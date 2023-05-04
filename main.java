/**
 * Sources: https://www.w3schools.com/java/java_user_input.asp 
 */
import java.util.Scanner;
import java.util.ArrayList;
 /**
     * This main function will introduce the user to the game, and ask for their name and dorm (first three lines). Following this, it will orient the player to their surroundings, run the first choice (with doorChoice), and then continue to break off into more choices with an if/else if statement leading to two different functions. 
     */
public class main {
    public static void main(String[] args) {
        String stringa = "north";
        String stringb = "North";
        String stringc = "South";
        String stringd = "south";
        Scanner name;
        name = new Scanner(System.in);
        String user;
        System.out.println("👻 Welcome to the Haunted Smith College game! 👻 In this game you'll need to free the ghosts (😨) that live on Smith College's campus! 😱");
        System.out.println("First we need to know your name!");
        user = name.nextLine();
        System.out.println("Welcome " + user + "! You have awoken to a dark room... 😢 There are two doors... 🚪 Do you choose the left door or the right door?");
        Scanner door;
        door = new Scanner(System.in);
        String doorOption;
        doorOption = door.nextLine();
        game newGamer = new game("Nalini", "Talbot");
        newGamer.doorChoice(doorOption);
        System.out.println("🚪 you walk through the door... and you're outside in the middle of the night 🌕 To the North you can see Ford hall 👩‍🔬. To the South you can see Burton Lawn 🌲. Do you go North or South?!");
        Scanner directionInput;
        directionInput = new Scanner(System.in);
        String userDirection;
        userDirection = directionInput.nextLine();
        boolean finished = false;
        while (finished == false) {
        if (stringa.equals(userDirection) || stringb.equals(userDirection)) {
            newGamer.investigateFord();
            finished = true;
        } else if (stringc.equals(userDirection) || stringd.equals(userDirection)) {
            newGamer.investigateNoise();
            finished = true;
        }
        else { 
            System.out.println("Please pick north or south");
            userDirection = directionInput.nextLine();
    }
    }
        
}

}
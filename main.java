/**
 * Sources: https://www.w3schools.com/java/java_user_input.asp 
 */
import java.util.Scanner;
    /**
     * This method will create a welcome message to introduce the user to the game, and ask for their name. They will then tell the user they need to choose between two doors, and call the doorChoice() method. If the user chooses right, they are brought back to main, and told to choose one direction: North, South, East, or West. If they choose one of these directions, they are re-directed to the associated method in the game() class. If they don't they remain in the while loop, where they are re-prompted to put in an accepted input. 
     */
public class main {
    public static void main(String[] args) {
        String stringnorth = "north";
        String stringNorth = "North";
        String stringsouth = "South";
        String stringSouth = "south";
        String stringeast = "east";
        String stringEast = "East";
        String stringwest = "west";
        String stringWest = "West";
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
        game newGamer = new game("Nalini");
        newGamer.doorChoice(doorOption);
        System.out.println("🚪 you walk through the door... and you're outside in the middle of the night 🌕 To the North you can see Ford hall 👩‍🔬. To the South you can see Burton Lawn 🌲. To the East you can see Seeyle 📕 and to the West you can see Tyler 🏠 Do you go North, South, East, or West?");
        Scanner directionInput;
        directionInput = new Scanner(System.in);
        String userDirection;
        userDirection = directionInput.nextLine();
        boolean finished = false;
        while (finished == false) {
        if (stringnorth.equals(userDirection) || stringNorth.equals(userDirection)) {
            newGamer.investigateFord();
            finished = true;
        } else if (stringsouth.equals(userDirection) || stringSouth.equals(userDirection)) {
            newGamer.investigateNoise();
            finished = true;
        } else if (stringeast.equals(userDirection) || stringEast.equals(userDirection)) {
            System.out.println("You try to enter Seeyle, but a ghost scares you off! 👻 If only you had a certain ITEM to appease it... 🧐 You go back to your original location, and decide to go into a different direction.... Pick a new direction now:");
            userDirection = directionInput.nextLine();
        } else if (stringwest.equals(userDirection) || stringWest.equals(userDirection)) {
            System.out.println("You try to enter Tyler, but a ghost smacks you with a frying pan from the dining hall 🍳! Ouch 😭! You retreat, and decide to come back when you have something to protect yourself... You now choose a different direction to go...");
            userDirection = directionInput.nextLine();
        }
        else { 
            System.out.println("That's not an option! 🫣 Please pick north, south, east, or west! ");
            userDirection = directionInput.nextLine();
    }
    }
        
}

}
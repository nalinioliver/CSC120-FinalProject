import java.util.Scanner;
/**
 * Establishes parameters used for this class, including the user direction (burtonMove)
 */
public class leaveBurton {
    public String burtonMove;

/**
 * Assigns the variable used to decide user direction 
 * @param burtonMove the direction the user chooses to go
 */
    public leaveBurton(String burtonMove) {
        this.burtonMove = burtonMove;
    }

    /**
     * Re-directs the user to a new location (that isn't Burton) based on the map that has been created in the game. If they try to go more South, or try to add an input that isn't one of the accepted options, they remain in the while loop (established with checkBurton = false), and are re-prompted to add an input. If they choose one of the accepted options, they are re-directed to the associated method in the game() class.  
     * @param burtonMove the direction the user chooses to go 
     */
    public static void moveBurton(String burtonMove) {
        boolean checkBurton = false;
        while (checkBurton == false) {
        if (burtonMove.equals("north") || (burtonMove.equals("North"))) {
            System.out.println("You're on your way to Ford.... be safe!! 💖👻");
            game newGamer = new game("Nalini");
            newGamer.investigateFord();
        }
        else if (burtonMove.equals("east") || (burtonMove.equals("East"))) {
            System.out.println("You are now in Seeyle!");
            game newGamer = new game("Nalini");
            newGamer.exploreSeeyle();
            
        } 
        else if (burtonMove.equals("west") || (burtonMove.equals("West"))) {
            System.out.println("You are now in Tyler");
            game newGamer = new game("Nalini");
            newGamer.exploreTyler();

        }
        else {
            System.out.println("Please pick one of the accepted directions 🤬");
            Scanner Burton;
            Burton = new Scanner(System.in);
            burtonMove = Burton.nextLine();

        }
    }
}
}

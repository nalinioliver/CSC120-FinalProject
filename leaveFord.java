import java.util.Scanner;

/**
 * Establishes parameters used for this class, including the user direction (fordMove)
 */
public class leaveFord {
    public String fordMove;

    /**
     * Assigns the variable used to decide user direction 
     * @param fordMove the direction the user chooses to go 
     */
    public leaveFord(String fordMove) {
    this.fordMove = fordMove;
}

/**
 * Re-directs the user to a new location (that isn't Ford) based on the map that has been created in the game. If they try to go more North, or try to add an input that isn't one of the accepted options, they remain in the while loop (established with checkFord = false), and are re-prompted to add an input. If they choose one of the accepted options, they are re-directed to the associated method in the game() class.  
 * @param fordMove The direction the user chooses to go 
 */
    public static void moveFord(String fordMove) {

        boolean checkFord = false;
        while (checkFord == false) {
            if (fordMove.equals("south") || (fordMove.equals("South"))) {
                System.out.println("You're on your way to Burton.... be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.investigateNoise();
            }
            else if (fordMove.equals("east") || (fordMove.equals("East"))) {
                System.out.println("You are now on your way to Seeyle.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.exploreSeeyle();
                
            } 
            else if (fordMove.equals("west") || (fordMove.equals("West"))) {
                System.out.println("You are now on your way to Tyler.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.exploreTyler();
            } 
            
            else {
                System.out.println("Please pick one of the accepted directions 🤬");
                Scanner Ford;
                Ford = new Scanner(System.in);
                fordMove = Ford.nextLine();
    
            }
        }

        }

    }
    

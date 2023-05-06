import java.util.Scanner;

/**
 * Establishes parameters used for this class, including the user direction (tylerMove)
 */

public class leaveTyler {
    public String tylerMove;

    /**
     * Assigns the variable used to decide user direction 
     * @param tylerMove the direction that the user chooses to go 
     */
    public leaveTyler(String tylerMove) {
    this.tylerMove = tylerMove;
}

    /**
     * Re-directs the user to a new location (that isn't Tyler) based on the map that has been created in the game. If they try to go more West, or try to add an input that isn't one of the accepted options, they remain in the while loop (established with checkTyler = false), and are re-prompted to add an input. If they choose one of the accepted options, they are re-directed to the associated method in the game() class.  
     * @param tylerMove the direction that the user chooses to go 
     */
    public static void moveTyler(String tylerMove) {

        boolean checkTyler = false;
        while (checkTyler == false) {
            if (tylerMove.equals("south") || (tylerMove.equals("South"))) {
                System.out.println("You're on your way to Burton.... be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.investigateNoise();
            }
            else if (tylerMove.equals("north") || (tylerMove.equals("north"))) {
                System.out.println("You are now on your way to Ford.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.investigateFord();
                
            } 
            else if (tylerMove.equals("east") || (tylerMove.equals("East"))) {
                System.out.println("You are now on your way to Seeyle.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.exploreSeeyle();
            } 
            
            else {
                System.out.println("Please pick one of the accepted directions 🤬");
                Scanner tylerNext;
                tylerNext = new Scanner(System.in);
                tylerMove = tylerNext.nextLine();
    
            }
        }

        }

    }


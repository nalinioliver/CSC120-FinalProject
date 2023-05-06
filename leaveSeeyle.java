import java.util.Scanner;

/**
 * Establishes parameters used for this class, including the user direction (seeyleMove)
 */
public class leaveSeeyle {
    public String seeyleMove;

    /**
     * Assigns the variable used to decide user direction 
     * @param seeyleMove the direction that the user chooses to go 
     */
    public leaveSeeyle(String seeyleMove) {
    this.seeyleMove = seeyleMove;
}

    /**
     * Re-directs the user to a new location (that isn't Seeyle) based on the map that has been created in the game. If they try to go more East, or try to add an input that isn't one of the accepted options, they remain in the while loop (established with checkSeeyle = false), and are re-prompted to add an input. If they choose one of the accepted options, they are re-directed to the associated method in the game() class.  
     * @param seeyleMove The direction the user chooses to go 
     */
    public static void moveSeeyle(String seeyleMove) {

        boolean checkSeeyle = false;
        while (checkSeeyle == false) {
            if (seeyleMove.equals("south") || (seeyleMove.equals("South"))) {
                System.out.println("You're on your way to Burton.... be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.investigateNoise();
            }
            else if (seeyleMove.equals("north") || (seeyleMove.equals("north"))) {
                System.out.println("You are now on your way to Ford.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.investigateFord();
                
            } 
            else if (seeyleMove.equals("west") || (seeyleMove.equals("West"))) {
                System.out.println("You are now on your way to Tyler.. be safe!! 💖👻");
                game newGamer = new game("Nalini");
                newGamer.exploreTyler();
            } 
            
            else {
                System.out.println("Please pick one of the accepted directions 🤬");
                Scanner seeyleNext;
                seeyleNext = new Scanner(System.in);
                seeyleMove = seeyleNext.nextLine();
    
            }
        }

        }

    }

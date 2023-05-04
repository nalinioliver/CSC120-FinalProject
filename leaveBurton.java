import java.util.Scanner;
public class leaveBurton {
    private String choice;

    public leaveBurton(String choice) {
        this.choice = choice;
    }

    public static void movePerson(String moveIn) {
        String stringA = "north";
        String stringB = "North";
        String stringC = "south";
        String stringD = "South";
        String stringE = "West";
        String stringF = "west";
        String stringG = "East";
        String stringH = "east";
        if (stringA.equals(moveIn) || (stringB.equals(moveIn))) {
            System.out.println("You're on your way to Ford.... be safe!! 💖👻");
            game newGamer = new game("Nalini", "Talbot");
            newGamer.investigateFord();
        }
        else if (stringC.equals(moveIn) || (stringD.equals(moveIn))) {
            System.out.println("You can't move any more South!");
            //Need to fix 
            System.exit(0);
        } 
        else if (stringE.equals(moveIn) || (stringF.equals(moveIn))) {
            System.out.println("You are now in Hillyer");
        }
        else if (stringG.equals(moveIn) || (stringH.equals(moveIn))) {
            System.out.println("You are now in Seeyle!");
        }
    }
}

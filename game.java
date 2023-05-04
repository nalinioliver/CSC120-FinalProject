/**
 * Filename game.java
 * Description This is my submission for "Final Project Phase 1: Draft Codebase and Annotated Architecture Diagram". This includes the code that I'm currently working on for my game, including some of the options for exploring the map that I'm creating. However, this is far from done! 
 * @author Nalini Oliver
 * Resources: Previous Gradescope assignments, https://www.w3schools.com/java/java_arraylist.asp and https://www.w3schools.blog/tostring-method-in-java and https://linuxhint.com/end-java-program/
 */
import java.util.Scanner;

import java.util.ArrayList;

public class game {
    private String name;
    private String house;
    public String door;
    /**
     * Sets parameters for what the user should initally input for the game to get started, which will be used to determine the end location of the game (still need to add code for this!)
     * @param name The name of the person playing the game 
     * @param house The dorm of the person playing the game (should be assoicated with a dorm at Smith College)
     */
    public game(String name, String house) {
        this.name = name;
        this.house = house;
    }

    /**
     * The first choice of the player when they "wake up", where they must decide to either choose the left or right door. If they choose the left door, they die immediately. If they choose the right door, they're taken above ground. Also tries to accomidate for differences in capitalization 
     * @param door the user input for either the left or right door 
     */
    public static void doorChoice(String door) {
    String string1 = "left";
    String string2 = "Left";
    String string3 = "right";
    String string4 = "Right";
    if (string1.equals(door) || (string2.equals(door))) {
            System.out.println("Oh no! There was an angry ghost! 👻 You're dead 💀 GAME OVER!!!");
            System.exit(0);
        } else if ((string3.equals(door)) || (string4.equals(door))) {
            System.out.println("The door is unlocked, and you're able to go through... 🧐");
        } 
        else {
            System.out.println("Your only two choices are left or right. Please choose one of the two");
            // Need to find a way to loop back over this
            System.exit(0);
        }
    }

    /**
     * If the player chose to go to Burton lawn, this function will cause them to encounter a ghost, and have to answer a riddle in order to progress in the game. This function will request a user input, which will then be tested for accuracy. 
     */
    public static void investigateNoise() {
        System.out.println("You are now on Burton Lawn 🌲 You see a figure in the distance...!");
        System.out.println("You investigate the noise.... Agh! There's a ghost 👻 It has a riddle, if you answer correctly, it will be free from the campus.... Answer wisely! 😤 The riddle is as followed (Credit for this riddle: Good Housekeeping).... I'm thinking of an odd number... Subtract a letter and it become even... What number is it?");
        Scanner riddle;
        riddle = new Scanner(System.in);
        Integer userRiddle;
        userRiddle = riddle.nextInt();
        if (userRiddle == 7) {
            System.out.println("Correct! The ghost is free 👻 No more hauntings on Burton Lawn!.... Now where do you want to go next, North to Ford, East to Seeyle, or West to Hillyer?");
            leaveBurton trial1 = new leaveBurton("east");
            Scanner move;
            move = new Scanner(System.in);
            String moveIn;
            moveIn = move.nextLine();
            trial1.movePerson(moveIn);
        }
        else {
            System.out.println("Incorrect! The ghost 👻 got mad, and you were catapulted out of Burton Lawn! GAME OVER!!!!!");
            System.exit(0);
        }
    }

    /**
     * If the player chooses to go into Ford, this function will cause them to encounter a ghost, and have to answer a trivia question in order to progress in the game. This function also requests a user input, which is then tested for accuracy based on the "if" statement. 
     */
    public static void investigateFord() {
        String string5 = "joseph";
        String string6 = "Joseph";
        System.out.println("You are in Ford hall! In the atrium, you see airpods, a pippett and a sticker... 🫣. One of these wil help you to set a ghost free later on... 😨 Which do you pick?");
        Scanner fordItem;
        fordItem = new Scanner(System.in);
        String userItem;
        userItem = fordItem.nextLine();
        ArrayList<String> item = new ArrayList<String>();
        item.add(userItem);
        System.out.println("After grabbing your item, you investigate further into Ford, and find a ghost! 👻 The only way to set them free is to prove your love for Smithies in STEM and answer the following trivia: What is the first name of the professor founded the computer science department at Smith in 1988? 👩‍💻");
        Scanner riddleTwo;
        riddleTwo = new Scanner(System.in);
        String riddleTwoAnswer;
        riddleTwoAnswer = riddleTwo.nextLine();
        if (string5.equals(riddleTwoAnswer) || (string6.equals(riddleTwoAnswer))) {
            System.out.println("Correct! You have set the ghost free!");
            
        } 
        else {
            System.out.println("Incorrect! You have made the ghost mad! 🤬 And now you're dead 💀 GAME OVER!!!!!!");
            System.exit(0);
        }
    }
}
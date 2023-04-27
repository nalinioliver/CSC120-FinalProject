/**
 * Filename game.java
 * Description This is my submission for "Final Project Phase 1: Draft Codebase and Annotated Architecture Diagram". This includes the code that I'm currently working on for my game, including some of the options for exploring the map that I'm creating. However, this is far from done! 
 * @author Nalini Oliver
 * Resources: Previous Gradescope assignments, https://www.w3schools.com/java/java_arraylist.asp and https://www.w3schools.blog/tostring-method-in-java 
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
        if (door == "left") {
            System.out.println("Oh no! There was an angry ghost! You're dead 💀");
        } else if (door == "right") {
            System.out.println("The door is unlocked, and you're able to go through... 🧐");
        } else if (door == "Right") {
            System.out.println("The door is unlocked, and you're able to go through... 🧐");
        }
            else if (door == "Left") {
            System.out.println("Oh no! There was an angry ghost! You're dead 💀");
        }
        else {
            System.out.println("Your only two choices are left or right. Please choose one of the two");
        }

    }

    /**
     * If the player chose to go to Burton lawn, this function will cause them to encounter a ghost, and have to answer a riddle in order to progress in the game. This function will request a user input, which will then be tested for accuracy. 
     */
    public static void investigateNoise() {
        System.out.println("You investigate the noise.... Agh! There's a ghost 👻 It has a riddle, if you answer correctly, it will be free from the campus.... Answer wisely! 😤 The riddle is as followed (Credit for this riddle: Good Housekeeping).... I'm thinking of an odd number... Subtract a letter and it become even... What number is it?");
        Scanner riddle;
        riddle = new Scanner(System.in);
        Integer userRiddle= riddle.nextInt();
        if (userRiddle == 7) {
            System.out.println("Correct! The ghost is free 👻 No more hauntings on Burton Lawn!");
        }
        else {
            System.out.println("Incorrect! The ghost 👻 got mad, and you were catapulted out of Burton Lawn!");
        }

    }

    /**
     * If the player chooses to go into Ford, this function will cause them to encounter a ghost, and have to answer a trivia question in order to progress in the game. This function also requests a user input, which is then tested for accuracy based on the "if" statement. 
     */
    public static void investigateFord() {
        System.out.println("After grabbing your item, you investigate further into Ford, and find a ghost! 👻 The only way to set them free is to prove your love for Smithies in STEM and answer the following trivia: Which professor founded the computer science department at Smith in 1988? 👩‍💻");
        Scanner riddleTwo;
        riddleTwo = new Scanner(System.in);
        String newRiddle = riddleTwo.toString();
        if (newRiddle == "Joseph O'Rouke") {
            System.out.println("Correct! You have set the ghost free!");
        } 
        else {
            System.out.println("Incorrect! You have made the ghost mad! 🤬");
        }

    }
   
    /**
     * This main function will introduce the user to the game, and ask for their name and dorm (first three lines). Following this, it will orient the player to their surroundings, run the first choice (with doorChoice), and then continue to break off into more choices with an if/else if statement leading to two different functions. 
     */
    public static void main(String[] args) {
        System.out.println("👻 Welcome to the Haunted Smith College game! 👻 In this game you'll need to free the ghosts (😨) that live on Smith College's campus! 😱");
        System.out.println("First we need to know your name, and what dorm you live in!");
        game newGamer = new game("Nalini", "Talbot");
        System.out.println("You have awoken to a dark room... 😢 There are two doors... 🚪 Do you choose the left door or the right door?");
        Scanner doorinput;
        doorinput = new Scanner(System.in);
        String userInput = doorinput.toString();
        doorChoice(userInput);
        System.out.println("🚪 you walk through the door... and you're outside in the middle of the night 🌕 To the North you can see Ford hall 👩‍🔬. To the South you can see Burton Lawn 🌲. Do you go North or South?!");
        Scanner directionInput;
        directionInput = new Scanner(System.in);
        String userDirection= directionInput.toString();
        if (userDirection == "north") {
            System.out.println("You are in Ford hall! In the atrium, you see an engineer's cap, a pippett and a handbook on learning to code with java... 🫣. One of these wil help you to set a ghost free... 😨 Which do you pick?");
            Scanner fordItem;
            fordItem = new Scanner(System.in);
            String userItem= fordItem.toString();
            ArrayList<String> item = new ArrayList<String>();
            item.add(userItem);
            investigateFord();
        } else if (userDirection == "south") {
            System.out.println("You are now on Burton Lawn 🌲 You see a figure in the distance...!");
            investigateNoise();
        }
        else { 
            System.out.println("Please pick north or south");
        }


    }
}
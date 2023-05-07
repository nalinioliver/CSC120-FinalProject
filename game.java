/**
 * Filename game.java
 * Description This is my submission for "Final Project: Final Deliverables". 
 * @author Nalini Oliver
 * Resources: CSC 120 TA Hours, Previous Gradescope assignments, https://www.w3schools.com/java/java_arraylist.asp and https://www.w3schools.blog/tostring-method-in-java and https://linuxhint.com/end-java-program/
 */
import java.util.Scanner;

import java.util.ArrayList;

    /**
     * Establishes parameters used in the game, including the name of the user, an array list that stores the user's inventory (named item), and an array list that keep tracks of the locations the user has been (named track_player) 
     */
public class game {
    private String name;
    public static ArrayList<String> item = new ArrayList<String>();
    public static ArrayList<String> track_player = new ArrayList<String>();

    /**
     * Assigns the variables used for making a new "gamer", i.e- individual that will play the game
     * @param name The name of the person playing the game 
     */
    public game(String name) {
        this.name = name;
    }

    /**
     * The first choice of the player when they "wake up", where they must decide to either choose the left or right door. If they choose the left door, they die immediately. If they choose the right door, they're taken above ground. Also tries to accomidate for differences in capitalization 
     * @param door the user input for either the left or right door 
     */
    public static void doorChoice(String door) {
    boolean doorCheck = false;
    while (doorCheck == false) { 
        if ((door.equals("left")) || (door.equals("Left"))) {
            System.out.println("Oh no! There was an angry ghost! 👻 You're dead 💀 GAME OVER!!!");
            System.exit(0);
        } else if ((door.equals("right")) || (door.equals("Right"))) {
            System.out.println("The door is unlocked, and you're able to go through... 🧐");
            break;

        } 
        else {
            System.out.println("Your only two choices are left or right. Please choose one of the two 😢");
            Scanner doors;
            doors = new Scanner(System.in);
            String doorOption;
            door = doors.nextLine();
        }
    }
}

    /**
     * If the player chose to go to Burton Lawn, this method will check for multiple things. This method first checks if they've been to Burton by seeing if they have any of the inventory items that are acquired in Burton. If so, it tells the user to look somewhere else, and directs them to the leaveBurton class. If not, this method will allow the user to choose 1 of 3 items for their inventory, which will re-prompt them to add an input if they choose anything other than these three options. After the item is chosen, this method causes the user to encounter a ghost, where they have to answer a riddle in order to explore other rooms through the leaveBurton class. 
     */
    public static void investigateNoise() {
        if ((item.contains("book")) || (item.contains("Book")) || (item.contains("hoodie")) || (item.contains("Hoodie"))  || (item.contains("sushi")) || (item.contains("Sushi"))) {
            System.out.println("You arrive at Burton Lawn 👻... but you realize you've already been here 😱... You look around, but there's nothing else here 💪🏽! It's time to explore a new place... Do you want to go North, East, or West? 😨"); 
            leaveBurton trial1 = new leaveBurton("east");
            Scanner move;
            move = new Scanner(System.in);
            String burtonMove;
            burtonMove = move.nextLine();
            trial1.moveBurton(burtonMove);
        } else {
        track_player.add("burton");
        System.out.println("When you enter Burton lawn, you see three items: book 📕, hoodie 🧥 and sushi 🍣! BUT you can only pick one... this will be VERY important later on 🫣... so choose wisely!!! 🤩");
        Scanner Item;
        Item = new Scanner(System.in);
        String burtonItem;
        burtonItem = Item.nextLine();
        boolean burton = false;
        while (burton == false) {
            if ((burtonItem.equals("book")) || (item.contains("Book"))) {
                item.add(burtonItem);
                System.out.println(burtonItem + " was added to inventory");
                System.out.println("You are now on Burton Lawn 🌲 You see a figure in the distance...!");
                System.out.println("You investigate the noise.... Agh! There's a ghost 👻 It has a riddle, if you answer correctly, it will be free from the campus.... Answer wisely! 😤 The riddle is as followed (Credit for this riddle: Good Housekeeping).... What is more useful when it is broken?");
                Scanner riddle;
                riddle = new Scanner(System.in);
                String userRiddle;
                userRiddle = riddle.nextLine();
                if ((userRiddle.contains("egg")) || (userRiddle.contains("Egg"))) {
                    System.out.println("Correct! The ghost is free 👻 No more hauntings on Burton Lawn!.... Now where do you want to go next, North to Ford, East to Seeyle, or West to Tyler (just know you can't move any further South...)?");
                    leaveBurton trial1 = new leaveBurton("east");
                    Scanner move;
                    move = new Scanner(System.in);
                    String burtonMove;
                    burtonMove = move.nextLine();
                    trial1.moveBurton(burtonMove);
                }
                else {
                    System.out.println("Incorrect! The ghost 👻 got mad, and you were catapulted out of Burton Lawn! GAME OVER!!!!!");
                    System.exit(0);
                }
            } else if ((burtonItem.equals("hoodie")) || (item.contains("Hoodie"))) {
                item.add(burtonItem);
                System.out.println(burtonItem + " was added to inventory");
                System.out.println("You are now on Burton Lawn 🌲 You see a figure in the distance...!");
                System.out.println("You investigate the noise.... Agh! There's a ghost 👻 It has a riddle, if you answer correctly, it will be free from the campus.... Answer wisely! 😤 The riddle is as followed (Credit for this riddle: Good Housekeeping).... What is more useful when it is broken?");
                Scanner riddle;
                riddle = new Scanner(System.in);
                String userRiddle;
                userRiddle = riddle.nextLine();
                if ((userRiddle.contains("egg")) || (userRiddle.contains("Egg"))) {
                    System.out.println("Correct! The ghost is free 👻 No more hauntings on Burton Lawn!.... Now where do you want to go next, North to Ford, East to Seeyle, or West to Tyler (just know you can't move any further South...)?");
                    leaveBurton trial1 = new leaveBurton("east");
                    Scanner move;
                    move = new Scanner(System.in);
                    String burtonMove;
                    burtonMove = move.nextLine();
                    trial1.moveBurton(burtonMove);
                }
                else {
                    System.out.println("Incorrect! The ghost 👻 got mad, and you were catapulted out of Burton Lawn! GAME OVER!!!!!");
                    System.exit(0);
                }
            } else if ((burtonItem.equals("sushi")) || (item.contains("Sushi"))) {
                item.add(burtonItem);
                System.out.println(burtonItem + " was added to inventory");
                System.out.println("You are now on Burton Lawn 🌲 You see a figure in the distance...!");
                System.out.println("You investigate the noise.... Agh! There's a ghost 👻 It has a riddle, if you answer correctly, it will be free from the campus.... Answer wisely! 😤 The riddle is as followed (Credit for this riddle: Good Housekeeping).... What is more useful when it is broken?");
                Scanner riddle;
                riddle = new Scanner(System.in);
                String userRiddle;
                userRiddle = riddle.nextLine();
                if ((userRiddle.contains("egg")) || (userRiddle.contains("Egg"))) {
                    System.out.println("Correct! The ghost is free 👻 No more hauntings on Burton Lawn!.... Now where do you want to go next, North to Ford, East to Seeyle, or West to Tyler (just know you can't move any further South...)?");
                    leaveBurton trial1 = new leaveBurton("east");
                    Scanner move;
                    move = new Scanner(System.in);
                    String burtonMove;
                    burtonMove = move.nextLine();
                    trial1.moveBurton(burtonMove);
                }
                else {
                    System.out.println("Incorrect! The ghost 👻 got mad, and you were catapulted out of Burton Lawn! GAME OVER!!!!!");
                    System.exit(0);
                }
            } else {
                System.out.println("That's not an item in front of you! Please pick one of the items");
                Scanner ItemReDo;
                ItemReDo = new Scanner(System.in);
                burtonItem = ItemReDo.nextLine();
            }
    }
}
}
     /**
     * If the player chose to go to Ford, this method will check for multiple things. This method first checks if they've been to Ford by seeing if they have any of the inventory items that are acquired in Ford. If so, it tells the user to look somewhere else, and directs them to the leaveFord class. If not, this method will allow the user to choose 1 of 3 items for their inventory, which will re-prompt them to add an input if they choose anything other than these three options. After the item is chosen, this method causes the user to encounter a ghost, where they have to answer a riddle in order to explore other rooms through the leaveFord class. 
     */
    public static void investigateFord() {
        if ((item.contains("airpods")) || (item.contains("Airpods")) || (item.contains("pippett")) || (item.contains("Pippett")) || (item.contains("sticker")) || (item.contains("Sticker"))) {
            System.out.println("You arrive at Ford hall 👻... but you realize you've already been here 😱... there's nothing else here to investigate 💪🏽! You decide to explore a new place... Do you want to go South, East, or West? 😨"); 
            leaveFord trial2 = new leaveFord("east");
            Scanner Ford;
            Ford = new Scanner(System.in);
            String fordMove;
            fordMove = Ford.nextLine();
            trial2.moveFord(fordMove);
     }  else {
        track_player.add("ford");
        System.out.println("You are in Ford hall! In the atrium, you see airpods, a pippett and a sticker... 🫣. One of these wil help you to set a ghost free later on... 😨 Which do you pick?");
        Scanner fordItem;
        fordItem = new Scanner(System.in);
        String userItem;
        userItem = fordItem.nextLine();
        boolean ford = false;
        while (ford == false) {
        if ((userItem.equals("airpods")) || (item.contains("Airpods"))) {
            item.add(userItem);
            System.out.println(userItem + " was added to inventory");
            System.out.println("After grabbing your item, you investigate further into Ford, and find a ghost! 👻 The only way to set them free is to prove your love for Smithies in STEM and answer the following trivia: What is the FULL first name of the professor founded the computer science department at Smith in 1988? 👩‍💻");
            Scanner riddleTwo;
            riddleTwo = new Scanner(System.in);
            String riddleTwoAnswer;
            riddleTwoAnswer = riddleTwo.nextLine();
            if (riddleTwoAnswer.equals("joseph") || (riddleTwoAnswer.equals("Joseph"))) {
                System.out.println("Correct! You have set the ghost free! 💪🏽 You leave Ford... where do you want to go now (pick a direction: south, east, or west... just know you can't move any more North!)");
                leaveFord trial2 = new leaveFord("east");
                Scanner Ford;
                Ford = new Scanner(System.in);
                String fordMove;
                fordMove = Ford.nextLine();
                trial2.moveFord(fordMove);
            } 
            else {
                System.out.println("Incorrect! You have made the ghost mad! 🤬 And now you're dead 💀 GAME OVER!!!!!!");
                System.exit(0);
            }
        }
        else if ((userItem.equals("pippett")) || (item.contains("Pippett"))) {
            item.add(userItem);
            System.out.println(userItem + " was added to inventory");
            System.out.println("After grabbing your item, you investigate further into Ford, and find a ghost! 👻 The only way to set them free is to prove your love for Smithies in STEM and answer the following trivia: What is the first name of the professor founded the computer science department at Smith in 1988? 👩‍💻");
            Scanner riddleTwo;
            riddleTwo = new Scanner(System.in);
            String riddleTwoAnswer;
            riddleTwoAnswer = riddleTwo.nextLine();
            if (riddleTwoAnswer.equals("joseph") || (riddleTwoAnswer.equals("Joseph"))) {
                System.out.println("Correct! You have set the ghost free! 💪🏽 You leave Ford... where do you want to go now (pick a direction: south, east, or west... just know you can't move any more North!)");
                leaveFord trial2 = new leaveFord("east");
                Scanner Ford;
                Ford = new Scanner(System.in);
                String fordMove;
                fordMove = Ford.nextLine();
                trial2.moveFord(fordMove);
                
            } 
            else {
                System.out.println("Incorrect! You have made the ghost mad! 🤬 And now you're dead 💀 GAME OVER!!!!!!");
                System.exit(0);
            }
        }

        else if ((userItem.equals("sticker")) || (item.contains("Sticker"))) {
            item.add(userItem);
            System.out.println(userItem + " was added to inventory");
            System.out.println("After grabbing your item, you investigate further into Ford, and find a ghost! 👻 The only way to set them free is to prove your love for Smithies in STEM and answer the following trivia: What is the first name of the professor founded the computer science department at Smith in 1988? 👩‍💻");
            Scanner riddleTwo;
            riddleTwo = new Scanner(System.in);
            String riddleTwoAnswer;
            riddleTwoAnswer = riddleTwo.nextLine();
            if (riddleTwoAnswer.equals("Joseph") || (riddleTwoAnswer.equals("joseph"))) {
                System.out.println("Correct! You have set the ghost free! 💪🏽 You leave Ford... where do you want to go now (pick a direction: south, east, or west... just know you can't move any more North!)");
                leaveFord trial2 = new leaveFord("east");
                Scanner Ford;
                Ford = new Scanner(System.in);
                String fordMove;
                fordMove = Ford.nextLine();
                trial2.moveFord(fordMove);
                
            } 
            else {
                System.out.println("Incorrect! You have made the ghost mad! 🤬 And now you're dead 💀 GAME OVER!!!!!!");
                System.exit(0);
            }
        }   
        
        else {
            System.out.println("That's not an item in front of you! Please pick one of the items");
            Scanner items;
            items = new Scanner(System.in);
            userItem = items.nextLine();
        }
    }
}

}

    /**
     * If the player attempts to go to Seeyle, this method will check for multiple things. If they've already been to Seeyle, it directs them to pick a new place. This method requires that they've already been to Burton Lawn, by seeing if they have any of the inventory items from that location. If they don't, they're told they can't enter Seeyle yet. If they do, they're asked to use one of the items in their inventory to appease the ghost. If they choose the correct item (sushi) they either progress through the game through the leaveSeeyle class (if they haven't defeeated the ghost in Tyler) or win the game (if they have). 
     */
    public static void exploreSeeyle() { 
        if (track_player.contains("seeyle")) {
            System.out.println("You've arrived at Seeyle! 💪🏽 But you've already been here! Let's explore some place new. Pick a direction: North, South, or West");
            leaveSeeyle trial3 = new leaveSeeyle("east");
            Scanner seeyleNext;
            seeyleNext = new Scanner(System.in);
            String seeyleMove;
            seeyleMove = seeyleNext.nextLine();
            trial3.moveSeeyle(seeyleMove);
        }
        else if ((item.contains("book")) || (item.contains("Book")) || (item.contains("hoodie")) || (item.contains("Hoodie"))  || (item.contains("sushi")) || (item.contains("Sushi"))) {
            track_player.add("seeyle");
            System.out.println("You've acquired some items! Perfect, because there's a ghost flying at you!! Pick an item from your inventory to appease the ghost... Remember, the following items are in your inventory:" + item);
            Scanner appeaseGhost;
            appeaseGhost = new Scanner(System.in);
            String appease;
            appease = appeaseGhost.nextLine();
            boolean seeyle = false;
            while (seeyle == false) { 
            if ((item.contains(appease))) {
                System.out.println("You chose" + appease + "! To appease the ghost!");
                    if ((appease.equals("sushi")) || (appease.equals("Sushi"))) {
                        System.out.println("Yum! This ghost loves sushi 🍱! The ghost is happy 😋 And is free!");
                        if ((track_player.contains("tyler")) && (track_player.contains("burton")) && (track_player.contains("seeyle")) && (track_player.contains("ford"))) {
                            System.out.println(" 🎆 CONGRATULATIONS!!!! 🎆 YOU HAVE FREED ALL THE GHOSTS AND SAVED SMITH! 💪🏽 The game is now finished! Thank you for playing!!");
                            System.exit(0);
                        }
                            else if (item.contains("airpods") || item.contains("Airpods") || (item.contains("pippett")) || (item.contains("Pippett")) || (item.contains("sticker")) || (item.contains("Sticker"))) {
                                System.out.println("Even though you defeated the ghost... there's still more left... where would you like to go next? North, South, or West (you can't move any farther east)?");
                                leaveSeeyle trial3 = new leaveSeeyle("east");
                                Scanner seeyleNext;
                                seeyleNext = new Scanner(System.in);
                                String seeyleMove;
                                seeyleMove = seeyleNext.nextLine();
                                trial3.moveSeeyle(seeyleMove);

                            } else {
                                System.out.println("There's still more ghosts on campus... Where would you like to go next? North, South, or West (you can't move any farther east)?");
                                leaveSeeyle trial3 = new leaveSeeyle("east");
                                Scanner seeyleNext;
                                seeyleNext = new Scanner(System.in);
                                String seeyleMove;
                                seeyleMove = seeyleNext.nextLine();
                                trial3.moveSeeyle(seeyleMove);

                            }
                    } else {
                        System.out.println("INCORRECT!!! 🤬 You chose the WRONG ITEM and now you have been BANISHED!! 🫣👻 GAME OVER!!");
                        System.exit(0);
                    }
            } else { 
                System.out.println("You didn't pick anything in your inventory... pick something in your inventory, which is as followed:" + item);
                appeaseGhost = new Scanner(System.in);
                appease = appeaseGhost.nextLine();
            }
        }

        } else {
            System.out.println("You try to enter Seeyle, but a ghost scares you off! 👻 If only you had a certain ITEM to appease it... 🧐 You go back to your original location, and decide to go into a different direction.... Which you should pick now");
            leaveSeeyle trial3 = new leaveSeeyle("east");
            Scanner seeyleNext;
            seeyleNext = new Scanner(System.in);
            String seeyleMove;
            seeyleMove = seeyleNext.nextLine();
            trial3.moveSeeyle(seeyleMove);
        }
            }
   
    /**
     * If the player attempts to go to Tyler, this method will check for multiple things. If the player has already been to Tyler, it will direct them to a new place. This method requires that they've already been to Ford, by seeing if they have any of the inventory items from that location. If they don't, they're told they can't enter Ford yet. If they do, they're asked to use one of the items in their inventory to protect themselves from the ghost. If they choose the correct item (pippett) they either progress through the game through the leaveTyler class (if they haven't defeeated the ghost in Tyler) or win the game (if they have). 
     */
    public static void exploreTyler() {
        if (track_player.contains("tyler")) {
            System.out.println("You've arrived at Tyler! 💪🏽 But you've already been here! Let's explore some place new. Pick a direction: North, South, or East.");
            leaveTyler trialA = new leaveTyler("east");
            Scanner Tyler;
            Tyler = new Scanner(System.in);
            String tylerMove;
            tylerMove = Tyler.nextLine();
            trialA.moveTyler(tylerMove);
        }
        else if ((item.contains("airpods")) || (item.contains("Airpods")) || (item.contains("pippett")) || (item.contains("Pippett")) || (item.contains("sticker")) || (item.contains("Sticker"))) {
            track_player.add("tyler");
            System.out.println("You've acquired some items! Perfect, because there's a ghost is about to attack you with a frying pan! 🍳 Pick an item from your inventory to protect yourself... Remember, the following items are in your inventory:" + item);
            Scanner fightGhost;
            fightGhost = new Scanner(System.in);
            String fight;
            fight = fightGhost.nextLine();
            boolean tyler = false;
            while (tyler == false) { 
            if ((item.contains(fight))) {
                System.out.println("You chose" + fight + "! To protect yourself from the ghost!");
                    if ((fight.equals("pippett")) || (fight.equals("Pippett"))) {
                        System.out.println("Wow! The ghost respects your proper handling of a pippett 👻! It's free!");
                        if ((track_player.contains("tyler")) && (track_player.contains("burton")) && (track_player.contains("seeyle")) && (track_player.contains("ford"))) {
                            System.out.println(" 🎆 CONGRATULATIONS!!!! 🎆 YOU HAVE FREED ALL THE GHOSTS AND SAVED SMITH! 💪🏽 The game is now finished! Thank you for playing!!");
                            System.exit(0);
                        } 
                            else if ((item.contains("hoodie")) || (item.contains("sushi")) || (item.contains("book"))) {
                                System.out.println("Even though you defeated the ghost... there's still more left... where would you like to go next? North, South, or East (you can't move any farther West)?");
                                leaveTyler trialA = new leaveTyler("east");
                                Scanner Tyler;
                                Tyler = new Scanner(System.in);
                                String tylerMove;
                                tylerMove = Tyler.nextLine();
                                trialA.moveTyler(tylerMove);
            
                            } else {
                                System.out.println("There's still more ghosts on campus... Where would you like to go next? North, South, or East (you can't move any farther West)?");
                                    leaveTyler trialA = new leaveTyler("east");
                                    Scanner Tyler;
                                    Tyler = new Scanner(System.in);
                                    String tylerMove;
                                    tylerMove = Tyler.nextLine();
                                    trialA.moveTyler(tylerMove);
                                    }
                                    
                        } else {
                            System.out.println("INCORRECT!!! 🤬 You chose the WRONG ITEM and now you have been BANISHED!! 🫣👻 GAME OVER!!");
                            System.exit(0);
                            }
                    } else { 
                        System.out.println("You didn't pick anything in your inventory... pick something in your inventory, which is as followed:" + item);
                        fightGhost = new Scanner(System.in);
                        fight = fightGhost.nextLine();
                    }
                }
            
                } else {
                    System.out.println("You try to enter Tyler, but a ghost smacks you with a frying pan from the dining hall 🍳! Ouch 😭! You retreat, and decide to come back when you have something to protect yourself... You now choose a different direction to go...");
                    leaveTyler trialA = new leaveTyler("east");
                    Scanner Tyler;
                    Tyler = new Scanner(System.in);
                    String tylerMove;
                    tylerMove = Tyler.nextLine();
                    trialA.moveTyler(tylerMove);
                    

                }
            } 

}
# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions

 - What was your **overall approach** to tackling this project?

My  approach to this project was structuring the whole design of the game around the idea that there were two "levels" to the rooms that could be connected through the user inventory. Primarily, there were "level 1" rooms, that you could go into straight away, but would require some challenge to progress further in the game. Next, there were "level 2" rooms, which had restricted access, but could be bypassed following completion of level 1 and getting the proper intventory. By creating this strucutre, I could fill in unique aspects to each room to make the game interesting, but still connect each room through array lists. I could also make sure I was keeping track of which "level 1" rooms the user was in by checking their inventory. In order to facilitate this, it required a lot of while loops (since I would need some kind of usable input to continue since the levels were built off of one another). This use of array lists also came in handy when I needed to know if the user has been to all of the rooms. In order to check this (since this would signify they won the game) I made a "hidden" array list called track_player, that would add the name of the room they've been to once they've reached it succesfully, and would check this array list once the player has reached the restricted "level 2" rooms. In this way, I was able to connect the rooms together using array lists in two different ways.


 - What **new thing(s)** did you learn / figure out in completing this project? Is there anything that you wish you had **implemented differently**?

One thing I learned when completing this project was the utility of while loops! As I mentioned above, I relied heavily on while loops to get a viable user input that would let me have certain expected outcomes when writing my code. However, I was initally confused how I would structure these while loops since I wasn't iterating over a number, which is the way that I'm used to structuring this (i.e- a while loop that says i=0 and while (i is less than a certain number). Instead, I was waiting for a desired string output. However, when I went to CSC 120 TA hours, one of the TA's showed me how to do a while loop that uses a condition based on a boolean variable. This made it incredibly easy to write while loops for my intended purpose! One thing I wish I did differently was create a more standardized class that would allow me to use the same class for one broad function. For example, I have four differnt classes all related to re-directing the user once they're done with a certain location (leaveBurton, leaveFord, leaveSeeyle, leaveTyler). This wasn't ideal, since I had to re-write the same code over and over. Instead, I would have preferred to somehow either loop over the map in one class based on different conditions, or create a more general class that would allow me to change the details depending on the rooms the user has been to (if that's possible). However, I feel that when constructing this project, I had a lot of difficulty in translating this broad idea into actual code without having the structured guidelines/instructions we usually do for assignments! 


 - If you had **unlimited time**, what additional features would you implement?

If I had additional time, I would have liked to include a feature that would have allowed the user to have a conversation with a ghost, similar to our chatbot assignment. My idea was to have the user "talk" to a ghost, where the conversation would only end once the user gave a certain response with a key word. This key word would be continiouslly prompted based on different, randomly generated questions by the ghost (also similar to the chatbot). For example, if I wanted the user to say "dogs", I would have the ghost continouslly ask randomly generated questions like "what's fluffy?" and "what's cute?" and "what is the superior pet?", and let the user respond after each question like they're having a conversation with the ghost until they say "dogs". However, for the sake of time, I wasn't able to create this! 


 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?

The most helpful piece of feedback I recieved was from one of the TAs in CSC 120 (sadly I forget their name, but they helped out during the student hours on Wednesday), who told me how to condense my code into one line by putting "||" to signify "or". Knowing that I was trying to account for the differences in capitalization, this was incredibly helpful, since I didn't have to write a completely new "else if" statement for every iteration of a word I was testing. 
 

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?

If I could give myself some advice about this project, I would tell myself to create a well designed and detailed architecture diagram PRIOR to writing any code. I believe this saves a lot of time in the coding process, since there were so much code that I wrote that I ended up deleting because it was unecessary. I would also give myself the "hint" of having a clear method for keeping track of player movements, and having that be the very FIRST thing that I code/ be the core structure of my code. The track_player array list was one of the last things I added to this code. However, it ended up taking me a lot of time to come up with this idea, because I initally tried to re-structure my existing code to check players movements which was ultimately too complicated/ messed with my existing code. Instead, having a seperate and almost "invisible" way to track player movements was much easier, and (while an extra step/variable) still made it a cleaner process overall. 
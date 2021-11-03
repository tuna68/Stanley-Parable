import java.util.*;

class gameplay {
    int x = 1;
    public static boolean hintsTF = false;
    int ending = 0;
    int cowardEnding = 0;
    int seriousEnding = 0;
    int freedomEnding = 0;
    int countdownEnding = 0;
    int museumEnding = 0;
    int facilityOn = 0;
      
    void mainMenumethod() {
        Scanner input;
        input = new Scanner(System.in);
        String first;
        System.out.println("\n\n\n\n\n\n Play \n Options \n Endings \n Quit");
        if (hintsTF == true) {
            System.out.print("(try inputting sv_cheats 1)");
            System.out.println("");
        }
        first = input.nextLine();
        if (first.equals("play")) {
            openingmethod();
        } else if (first.equals("options")) {
            optionsmethod();
        } else if (first.equals("sv_cheats 1")) {
         seriousEndingmethod();
        } else if (first.equals("endings")) {
         endingsMethod();
        } else if (first.equals("debugger")) {
         debuggerMethod();
        } else {
        System.out.println("Quitting");
        }
    }
    
    void debuggerMethod() {
      Scanner input;
      input = new Scanner(System.in);
      String option1;
      util thread = new util();
      System.out.println("input key:");
      option1 = input.nextLine();
      
      if (option1.equals("sp040605")) {
         System.out.println("Debugger");
         System.out.println("endingsMethod");
         System.out.println("seriousEndingmethod");
         System.out.println("optionsmethod");
         System.out.println("closeDoormethod");
         System.out.println("upStairsmethod");
         System.out.println("doorChoicemethod");
         System.out.println("openingmethod");
         System.out.println("elevatorMethod");
         System.out.println("facilityMethod");
         System.out.println("facilityOffmethod");
         System.out.println("facilityOnmethod");
         System.out.println("escapeMethod");
         option1 = input.nextLine();
         
         if (option1.equals("endingsMethod")) {
            endingsMethod();
         } else if (option1.equals("seriousEndingethod")) {
            seriousEndingmethod();
         } else if (option1.equals("optionsmethod")) {
            optionsmethod();
         } else if (option1.equals("closeDoormethod")) {
            closeDoormethod();
         } else if (option1.equals("upStairsmethod")) {
            upStairsmethod();
         } else if (option1.equals("doorChoicemethod")) {
            doorChoicemethod();
         } else if (option1.equals("openingmethod")) {
            openingmethod();
         } else if (option1.equals("elevatorMethod")) {
            elevatorMethod();
         } else if (option1.equals("facilityMethod")) {
            facilityMethod();
         } else if (option1.equals("facilityOffmethod")) {
            facilityOffmethod();
         } else if (option1.equals("facilityOnmethod")) {
            facilityOnmethod();
         } else if (option1.equals("escapeMethod")) {
            escapeMethod();
         } else {
            System.out.println("invalid");
            debuggerMethod();
         }
         } else {
            System.out.print("invalid");
            mainMenumethod();
         }    
    }
    
    void endingsMethod() {
      Scanner input;
      input = new Scanner(System.in);
      String option1;
      util thread = new util();
      
      System.out.println("\nEndings Completed:");
      if (ending > 0) {
         if (seriousEnding == 1) {
            System.out.println("\nThe Serious Ending Completed");
         }
         if (cowardEnding == 1) {
            System.out.println("\nThe Coward Ending Completed");
         }
         if (freedomEnding == 1) {
            System.out.println("\nThe Freedom Ending Completed");
         }
         if (countdownEnding == 1) {
            System.out.println("\nThe Countdown Ending Completed");
         }
         if (museumEnding == 1) {
            System.out.println("\nThe Museum Ending Completed");
         }
         System.out.println("\nBack");
         option1 = input.nextLine();
         mainMenumethod();
      } else {
      System.out.println("\nNo endings completed");
      System.out.println("\nBack");
      option1 = input.nextLine();
      mainMenumethod();
      }
    }
    
    void seriousEndingmethod() {
      Scanner input;
      input = new Scanner(System.in);
      String option1;
      util thread = new util();
      
         System.out.println("[Stanley is taken to a room with a table in the middle of it.]");
         thread.wait(2500); 
         System.out.println("Stanley, this is me being serious.");
         thread.wait(2500); 
         System.out.println("In fact, this is my serious room. It's where I come to be serious.");
         thread.wait(3500);
         System.out.println("That table is the most serious table I could find. I looked at many, many tables. Hundreds of tables!");
         thread.wait(5500);
         System.out.println("It's possible I looked at over a thousand tables, I honestly don't know.");
         thread.wait(3500);
         System.out.println("The specific number isn't as important as the understanding that of all the tables that I looked at, this one is the most serious.");
         thread.wait(5500);
         System.out.println("I relate this story to impress upon you, the extent to which this is the most serious room I have, which is why I brought you here.");
         thread.wait(5500);
         System.out.println("You just tried to activate server cheats, which, of course, runs the risk of breaking the entire game.");
         thread.wait(3500);
         System.out.println("You've got no respect for the strict order of scripted narrative events and I just can't have that.");
         thread.wait(3500);
         System.out.println("It's time to get serious, Stanley. No jokes, no games.");
         thread.wait(2500);
         System.out.println("Outside of this room, I might be more tolerant of those things, but now we're in the room.");
         thread.wait(3500);
         System.out.println("Which is why I'm subjecting you to the most serious punishment I can think of: one hundred billion-trillion years, standing here in the serious room.");
         thread.wait(5500);
         System.out.println("Perhaps after that, we can talk about the severity of your actions, and whether you've learned anything.");
         thread.wait(3500);
         System.out.println("But, until then, serious room, GO.");
         
         option1 = input.nextLine();
         
         if (option1.equals("sv_cheats 1")) {
            
            System.out.println("Woah! Did we not have the talk? Are we not in the serious room this very moment? Did I not tell you how many tables I looked through?");
            thread.wait(4500);
            System.out.println("I'm going to be conservative and say it was somewhere in the tens of thousands of tables, any reasonable person would say I spent an ABSURD amount of time doing nothing but looking at tables!");
            thread.wait(6500);
            System.out.println("And I genuinely considered each one too. I took a hell of a lot of notes.");
            thread.wait(3500);
            System.out.println("I kept the notes in a different room.. that room is less serious than this one.");
            thread.wait(3500);
            System.out.println("It's more of a, um.. a notes room.");
            thread.wait(2500);
            System.out.println("Again, the point of this story is to convey how serious I feel this cheating issue is.");
            thread.wait(3500);
            System.out.println("And I'm sure you'll agree with me when you've fulfilled your new punishment: INFINITY years in the serious room.");
            thread.wait(4500);
            System.out.println("I generally have trouble reading human emotions, but I'm going to go out on a limb here, and say that you're devastated by this crippling new punishment.");
            thread.wait(5500);
            System.out.println("As well you should be. It's the most serious I could think of. Can you get more serious than that?");
            thread.wait(3500);
            System.out.println("No. You can't. Don't try.");
            
            option1 = input.nextLine();
            if (option1.equals("sv_cheats 1")) {
            
               
               System.out.println("Hmm, still no effect.");
               thread.wait(2500);
               System.out.println("The problem is clearly the serious room; it isn't serious enough.");
               thread.wait(3500);
               System.out.println("That's on me, Stanley. I apologize.");
               thread.wait(2500);
               System.out.println("I'm going to the store to look through more tables. Hopefully I find one that conveys how wrong what you're doing is.");
               thread.wait(4500);
               System.out.println("Now, where did I put those notes?");
               thread.wait(2500);
               System.out.println("[papers rustling]");
               thread.wait(5500);
               System.out.println("\nTHE SERIOUS ENDING COMPLETED");
               thread.wait(6500);
               ending++;
               seriousEnding = 1;
               mainMenumethod();
            }
            else
            {
            System.out.println("*nothing happens*");
            mainMenumethod();
            }
         }
         else
         {
         System.out.println("*nothing happens*");
         mainMenumethod();
         }
         
   }

    void optionsmethod() {
        Scanner input;
        input = new Scanner(System.in);

        String hints;

        if (hintsTF) {

            hints = "on";

        } else {

            hints = "off";

        }

        System.out.println("Hints: " + hints);
        System.out.println("on/off");
        hints = input.next();

        if (hints.equals("on")) {

            hintsTF = true;

        } else {

            hintsTF = false;

        }

        mainMenumethod();

    }

    void closeDoormethod() {
      util thread = new util();
        System.out.println("But Stanley simply couldn't handle the pressure.");
        thread.wait(3000);
        System.out.println("What if he had to make a decision? What if a crucial outcome fell under his responsibility? He had never been trained for that! No, this couldn't go any way except badly.");
        thread.wait(4500);
        System.out.println("The right thing to do now, Stanley thought to himself, is to wait. Nothing will hurt me. Nothing will break me. In here, I can be happy, forever. I will be happy.");
        thread.wait(4500);
        System.out.println("Stanley waited. Hours passed. Then days. Had years gone by? He no longer had the ability to tell.");
        thread.wait(3000);
        System.out.println("But the one thing he knew, for sure, beyond any doubt, was that if he waited long enough, the answers would come. Eventually, some day, they would arrive. Soon,");
        thread.wait(4000);
        System.out.println("Very soon now, this will end. He will be spoken to. He will be told what to do. Now it's just a little bit closer. Now it's even closer. Here it comes..");
        thread.wait(5500);
        System.out.println("\nTHE COWARD ENDING COMPLETED");
        thread.wait(6500);
        ending++;
        cowardEnding = 1;
        mainMenumethod();
    }
    
    void facilityOffmethod() {
      Scanner input;
      input = new Scanner(System.in);
      util thread = new util();
      String option1;
      System.out.println("Blackness... and a rising chill of uncertainty... was it over?");
      thread.wait(4000);
      System.out.println("[Slowly, a massive door stars to open]");
      thread.wait(3000);
      System.out.println("Yes! He had won. He had defeated the machine, unshackled himself from someone else's command. Freedom was mere moments away.");
      thread.wait(5500);
      System.out.println("And, yet, even as the immense door slowly opened, Stanley reflected on how many puzzles still lay unsolved.");
      thread.wait(5000);
      System.out.println("Where had his co-workers gone? How had he been freed from the machine's grasp? What other mysteries did this strange building hold?");
      thread.wait(6000);
      System.out.println("But as sunlight streamed into the chamber, he realized none of this mattered to him. For it was not knowledge, or even power, that he had been seeking, but happiness.");
      thread.wait(6500);
      System.out.println("Perhaps his goal had not been to understand, but to let go.");
      thread.wait(4000);
      System.out.println("No longer would anyone tell him where to go, what to do, or how to feel. Whatever life he lives, it will be his.");
      thread.wait(5000);
      System.out.println("And that was all he needed to know. It was, perhaps, the only thing worth knowing. [door completely opens]");
      thread.wait(5500);
      System.out.println("Stanley stepped through the open door.");
      System.out.println("\nWalk Forward");
      option1 = input.nextLine();
      System.out.println("Stanley felt the cool breeze upon his skin, the feeling of liberation, the immense possibility of the new path before him.");
      thread.wait(5000);
      System.out.println("This was exactly the way, right now, that things were meant to happen.");
      thread.wait(5000);
      System.out.println("And Stanley was happy.");
      thread.wait(6000);
      System.out.println("\nFREEDOM ENDING COMPLETED");
      thread.wait(6500);
      ending++;
      freedomEnding = 1;
      mainMenumethod();
    }
    
    void facilityMethod() {
      Scanner input;
      input = new Scanner(System.in);
      util thread = new util();
      String option1;
      System.out.println("[Stanley enters a giant room with a button in the middle of it.]");
      thread.wait(4000);
      System.out.println("[Stanley pushes the button]");
      thread.wait(3000);
      System.out.println("The lights rose on an enormous room packed with television screens.");
      thread.wait(4000);
      System.out.println("What horrible secret did this place hold, Stanley thought to himself. Did he have the strength to find out?");
      thread.wait(5000);
      System.out.println("[Stanley pushes another button]");
      thread.wait(3000);
      System.out.println("Now the monitors jumped to life, their true nature revealed.");
      thread.wait(4000);
      System.out.println("Each bore the numbers of an employee in the building, Stanley's co-workers.");
      thread.wait(4500);
      System.out.println("The lives of so many individuals reduced to images on a screen, and Stanley, one of them, eternally monitored in this place where freedom meant nothing.");
      thread.wait(6000);
      System.out.println("[Stanley pushes another button, which lowers an elevator");
      thread.wait(4000);
      System.out.println("This mind control facility... It was too horrible to believe; it couldn't be true.");
      thread.wait(4500);
      System.out.println("Had Stanley really been in someone's control all this time? Was this the only reason he was happy with his boring job?");
      thread.wait(6000);
      System.out.println("That his emotions had been manipulated to accept it blindly?");
      thread.wait(4000);
      System.out.println("[Stanley steps into the elevator]");
      thread.wait(3000);
      System.out.println("No! He refused to believe it. He couldn't accept it; his own life in someone else's control? Never!");
      thread.wait(5000);
      System.out.println("It was unthinkable, wasn't it? Was it even possible?");
      thread.wait(4000);
      System.out.println("Had he truly spent his entire life utterly blind to the world?");
      thread.wait(4000);
      System.out.println("But here was the proof. The heart of the operation. Controls labeled with emotions: 'happy' or 'sad' or 'content'.");
      thread.wait(5500);
      System.out.println("Walking, eating, working... all of it monitored and commanded from this very place.");
      thread.wait(5000);
      System.out.println("And as the cold reality of his past began to sink in, Stanley decided that this machinery would never again exert it's terrible power over another human life.");
      thread.wait(6500);
      System.out.println("For he would dismantle the controls once and for all.");
      thread.wait(3000);
      System.out.println("And when at last he found the source of the room's power, he knew it was his duty, his obligation, to put an end to this horrible place and to everything it stood for.");
      System.out.println("\nOff | On");
      option1 = input.nextLine();
      
      if (option1.equals("on")) {
         facilityOnmethod();
      } else {
         facilityOffmethod();
      }
    }
    
    void facilityOnmethod() {
      Scanner input;
      input = new Scanner(System.in);
      util thread = new util();
      String option1;
      if (facilityOn == 0) {
         System.out.println("Oh Stanley, you didn't just activate the controls, did you?");
         thread.wait(4000);
         System.out.println("After they kept you enslaved all these years you go and you try to take control of the machine for yourself, is that want you wanted? Control?");
         thread.wait(6000);
         System.out.println("Oh...Stanley. *sigh* I applaud your effort, I really do, but you need to understand; there's only so much that machine can do.");
         thread.wait(5500);
         System.out.println("You were supposed to let it go, turn the controls off, and leave.");
         thread.wait(4500);
         System.out.println("If you want to throw my story off track, you're going to have to do much better than that.");
         thread.wait(5000);
         System.out.println("I'm afraid you don't have nearly the power you think you do; for example, and I believe you'll find this pertinent:");
         thread.wait(5500);
         System.out.println("Stanley suddenly realized that he had just initiated the network's emergency detonation system.");
         thread.wait(5000);
         System.out.println("In the event that this machine is activated without proper DNA identification, nuclear detonators are set to explode, eliminating the entire complex.");
         thread.wait(6500);
         System.out.println("How long until detonation, then? Hmm...let's say, um...two minutes.");
         thread.wait(4500);
         System.out.println("[Lights turn on, as well as a humongous countdown clock]");
         thread.wait(4000);
         System.out.println("Ah, now this is making things a little more fun, isn't it, Stanley? It's your time to shine! You are the star! It's your story now; shape it to your heart's desires.");
         thread.wait(6500);
         System.out.println("Ooh, this is much better than what I had in mind! What a shame we have so little time left to enjoy it.");
         thread.wait(5000);
         System.out.println("Mere moments until the bomb goes off, but what precious moments each one of them is! More time to talk about you, about me, where we're going, what this all means...I barely know where to start!");
         thread.wait(7000);
         System.out.println("What's that? You'd like to know where your co-workers are? A moment of solace before you're obliterated?");
         thread.wait(5000);
         System.out.println("Alright. I'm in a good mood, and you're going to die anyway. I'll tell you exactly what happened to them: I erased them. I turned off the machine; I set you free.");
         thread.wait(6000);
         System.out.println("Of course, that was merely in this instance of the story. Sometimes when I tell it, I simply let you sit there in your office forever, pushing buttons endlessly and then dying alone.");
         thread.wait(6500);
         System.out.println("Other times, I let the office sink into the ground, swallowing everyone inside; or I let it burn to a crisp.");
         thread.wait(5000);
         System.out.println("I have to say this, though, this version of events has been rather amusing.");
         thread.wait(5000);
         System.out.println("Watching you try to make sense of everything and take back the control wrested away from you...it's quite rich. I almost hate to see it go!");
         thread.wait(6500);
         System.out.println("But I'm sure whatever I come up with on the next go around will be even better.");
         thread.wait(5000);
         System.out.println("My goodness! Only 34 seconds left...but I'm enjoying this so much!");
         thread.wait(5000);
         System.out.println("You know what? To hell with it. I'm going to put some extra time on the clock; why not!");
         thread.wait(5500);
         System.out.println("These are precious additional seconds, Stanley. Time doesn't grow on trees!");
         thread.wait(5500);
         System.out.println("Oh, dear me, what's the matter, Stanley? Is it that you have no idea where you are going or what you're supposed to be doing right now?");
         thread.wait(6500);
         System.out.println("Or did you just assume when you saw that timer that something in this room is capable of turning it off?");
         thread.wait(6000);
         System.out.println("I mean, look at you, running from button to button, screen to screen, clicking on every little thing in this room!");
         thread.wait(6000);
         System.out.println("These numbered buttons! No! These colored ones! Or maybe this big, red button! Or this door! Everything! Anything! Something here will save me!");
         thread.wait(6500);
         System.out.println("Why would you think that, Stanley? That this video game can be beaten, won, solved? Do you have any idea what your purpose in this place is?");
         thread.wait(7000);
         System.out.println("Hahaha, heh, Stanley...you're in for quite a disappointment.");
         thread.wait(5000);
         System.out.println("But here's a spoiler for you: that timer isn't a catalyst to keep the action moving along. It's just seconds ticking away to your death.");
         thread.wait(6000);
         System.out.println("You're only still playing instead of watching a cutscene because I want to watch you for every moment that you're powerless, to see you made humble.");
         thread.wait(7000);
         System.out.println("This is not a challenge. It's a tragedy. You wanted to control this world; that's fine. But I'm going to destroy it first, so you can't.");
         thread.wait(6750);
         System.out.println("Take a look at the clock, Stanley. That's 30 seconds you have left to struggle.");
         thread.wait(5000);
         System.out.println("Thirty seconds until a big boom, and then nothing. No ending here, just you being blown to pieces.");
         thread.wait(5500);
         System.out.println("Will you cling desperately to your frail life, or will you let it go peacefully?");
         thread.wait(5000);
         System.out.println("Another choice! Make it count. Or don't. It's all the same to me. All a part of the joke.");
         thread.wait(5500);
         System.out.println("And believe me, I will be laughing at every second of your inevitable life, from the moment we fade in until the moment I say:");
         thread.wait(6500);
         System.out.println("Happily");
         thread.wait(1000);
         System.out.println("Ever");
         thread.wait(1000);
         System.out.println("---");
         thread.wait(7000);
         System.out.println("\nTHE COUNTDOWN ENDING COMPLETED");
         thread.wait(5000);
         ending++;
         facilityOn++;
         countdownEnding = 1;
         mainMenumethod();
      } else {
         System.out.println("But you really believe there’s an answer! How many times will you replay this bit, looking desperately for a solution?");
         thread.wait(5500);
         System.out.println("Ten? A hundred? A thousand? I look forward to finding out, and to watching the bomb go off each time you fail.");
         thread.wait(5500);
         System.out.println("Just you and me and the retching explosion of fire and metal over and over and over for all of eternity.");
         thread.wait(5000);
         System.out.println("And Stanley died again.");
         thread.wait(3000);
         System.out.println("And Stanley died again.");
         thread.wait(3000);
         System.out.println("And Stanley died again.");
         thread.wait(6000);
         mainMenumethod();
      }
    }
    
    void elevatorMethod() {
      Scanner input;
      input = new Scanner(System.in);
      util thread = new util();
      String option1;
      System.out.println("Descending deeper into the building, Stanley realized he felt a bit peculiar.");
      thread.wait(3000);
      System.out.println("It was a stirring of emotion in his chest, as though he felt more free to think for himself, to question the nature of his job.");
      thread.wait(5000);
      System.out.println("Why did he feel this now, when for years it had never occurred to him?");
      thread.wait(4000);
      System.out.println("This question would not go unanswered for long.");
      thread.wait(4000);
      System.out.println("Stanley walked straight ahead through the large door that read 'Mind Control Facility'.");
      System.out.println("\nFacility | Escape");
      option1 = input.nextLine();
      
      if (option1.equals("escape")) {
         escapeMethod();
      } else {
         facilityMethod();
      }
    }
    
    void escapeMethod() {
    Scanner input;
    input = new Scanner(System.in);
    util thread = new util();
    String option1;
    System.out.println("Although this passageway had the word 'escape' written on it, the truth was that at the end of this hall, Stanley would meet his violent death.");
    System.out.println("\nWalk Forward | Turn Around");
    option1 = input.nextLine();
    
    if (option1.equals("walk forward")) {
      System.out.println("The door behind him was not shut. Stanley still had every opportunity to turn around and get back on track.");
      System.out.println("\nWalk Forward | Turn Around");
      option1 = input.nextLine();
      
      if (option1.equals("walk forward")) {
         System.out.println("At this point, Stanley was making a conscious, concerted effort to walk forward, and willingly confront his death.");
         System.out.println("As the machine whirled into motion, and Stanley was inched closer and closer to his demise, he reflected that his life had been of no consequence whatsoever.");
         thread.wait(7000);
         System.out.println("Stanley can't see the bigger picture. He doesn't know the real story. Trapped forever in his narrow vision of what this world is.");
         thread.wait(6000);
         System.out.println("Perhaps his death was of no great loss, like plucking the eyeballs from a blind man.");
         thread.wait(5000);
         System.out.println("And so he resigned, and willingly accepted this violent end to his brief and shallow life. Farewell, Stanley.");
         thread.wait(7500);
         System.out.println("[FEMALE NARRATOR]");
         thread.wait(4000);
         System.out.println("'Farewell Stanley' cried the Narrator, as Stanley was led helplessly into the enormous metal jaws.");
         thread.wait(6000);
         System.out.println("In a single visceral instant, Stanley was obliterated, as the machine crushed every bone in his body, killing him instantly.");
         thread.wait(7000);
         System.out.println("And yet it would be just a few minutes before Stanley would restart the game, back in his office, as alive as ever.");
         thread.wait(6500);
         System.out.println("What exactly did the Narrator think he was going to accomplish?");
         thread.wait(4500);
         System.out.println("When every path you can walk has been created for you long in advance, death becomes meaningless, making life the same.");
         thread.wait(6500);
         System.out.println("Do you see now? Do you see that Stanley was already dead from the moment he hit start?");
         thread.wait(6000);
         System.out.println("*laugh* Oh, look at these two.");
         thread.wait(4000);
         System.out.println("How they wish to destroy one another. How they wish to control one another.");
         thread.wait(5000);
         System.out.println("How they both wish to be free.");
         thread.wait(4000);
         System.out.println("Can you see? Can you see how much they need one another?");
         thread.wait(5500);
         System.out.println("No, perhaps not. Sometimes these things cannot be seen.");
         thread.wait(5500);
         System.out.println("But listen to me, You can still save these two. You can stop the program before they both fail");
         thread.wait(6500);
         System.out.println("Press 'escape' and press 'quit.' There's no other way to beat this game.");
         thread.wait(5500);
         System.out.println("As long as you move forward, you'll be walking someone else's path. Stop now, and it'll be your only true choice.");
         thread.wait(7000);
         System.out.println("Whatever you do, choose it! Don't let time choose for you! Don't let time-");
         thread.wait(8000);
         System.out.println("\nTHE MUSEUM ENDING COMPLETED");
         thread.wait(5000);
         ending++;
         museumEnding = 1;
         mainMenumethod();
      } else {
         System.out.println("But of course, Stanley thought better of it, and realized he simply had too much to live for.");
         thread.wait(5000);
         facilityMethod();
      }
    } else {
         System.out.println("But of course, Stanley thought better of it, and realized he simply had too much to live for.");
         thread.wait(5000);
         facilityMethod();
    }
  }
    void upStairsmethod() {
    Scanner input;
    input = new Scanner(System.in);
    util thread = new util();
    String option1;
    String option2;
    int code;
    System.out.println("Stepping into his manager's office, Stanley was once again stunned to discover not an indication of any human life.");
    thread.wait(3000);
    System.out.println("Shocked, unraveled, Stanley wondered in disbelief who orchestrated this, what dark secret was being held from him!"); 
    thread.wait(3000);
    System.out.println("What he could not have known was that the keypad behind the boss's desk guarded the terrible truth that his boss had been keeping from him.");
    thread.wait(4500); 
    System.out.println("And so the boss had assigned it an extra secret PIN number. 2845. But of course, Stanley couldn't possibly have known this.");
    thread.wait(2500);
    System.out.println("\nInput Code | Wait");
    option1 = input.nextLine();
      
    if (option1.equals("wait")) {//first option (in upstairsmethod)
      System.out.println("wait");//if user chooses wait
      System.out.println("\nInput Code");
      option1 = input.nextLine();
      System.out.println("Code:");
      code = input.nextInt();
      
      if (code == 2845) {//if correct code
         System.out.println("correct");
         System.out.println("\nUse Elevator");
         option1 = input.nextLine();
         option1 = input.nextLine();
         elevatorMethod();
      } else {
         System.out.println("wrong");//wrong code (1st try)
         System.out.println("\nInput Code");
         option2 = input.nextLine();
         option2 = input.nextLine();
         System.out.println("Code:");
         code = input.nextInt();
         
         if (code == 2845) {//if correct code
            System.out.println("correct");
            System.out.println("\nUse Elevator");
            option1 = input.nextLine();
            option1 = input.nextLine();
            elevatorMethod();
         } else {
            System.out.println("wrong");//wrong code (2nd try)
            System.out.println("override");
            System.out.println("\nUse Elevator");
            option1 = input.nextLine();
            option1 = input.nextLine();
            elevatorMethod();
         }
      }
    } else {
      System.out.println("Code:");
      code = input.nextInt();
      
      if (code == 2845) {//if correct code
         System.out.println("correct");
         System.out.println("\nUse Elevator");
         option1 = input.nextLine();
         option1 = input.nextLine();
         elevatorMethod();
      } else {
         System.out.println("wrong");//wrong code (1st try)
         System.out.println("\nInput code | Wait");
         option1 = input.nextLine();
         option1 = input.nextLine();
         
         if (option1.equals("wait")) {
         System.out.println("wait");//if user chooses wait
         System.out.println("\nInput Code");
         option1 = input.nextLine();
         System.out.println("Code:");
         code = input.nextInt();
         
         if (code == 2845) {//if correct code
            System.out.println("correct");
            System.out.println("\nUse Elevator");
            option1 = input.nextLine();
            option1 = input.nextLine();
            elevatorMethod();
         } else {
            System.out.println("wrong");//wrong code (2nd try)
            System.out.println("override");
            System.out.println("\nUse Elevator");
            option1 = input.nextLine();
            option1 = input.nextLine();
            elevatorMethod();
           }
         } else {
            System.out.println("Code:");
            code = input.nextInt();
      
            if (code == 2845) {//if correct code
               System.out.println("correct");
               System.out.println("\nUse Elevator");
               option1 = input.nextLine();
               option1 = input.nextLine();
               elevatorMethod();
            } else {
               System.out.println("wrong");//wrong code (2nd try)
               System.out.println("override");
               System.out.println("\nUse Elevator");
               option1 = input.nextLine();
               option1 = input.nextLine();
               elevatorMethod();
               } 
             }
          }
       }
    }
    
    void doorChoicemethod() {
        Scanner input;
        input = new Scanner(System.in);
        util thread = new util();
        String option1;
        System.out.println("When Stanley came to a set of 2 open doors, he entered the door on his left.");
        System.out.println("\nLeft Door | Right Door");
        option1 = input.nextLine();
        
        if (option1.equals("right door")) {
           System.out.println("This was not the correct way to the meeting room, and Stanley knew it perfectly well. Perhaps he wanted to stop by the employee lounge first, just to admire it.");
           thread.wait(4000);
           System.out.println("Ah, yes, truly a room worth admiring. It had really been worth the detour after all, just to spend a few moments here in this immaculate, beautifully constructed room. Stanley simply stood here, drinking it all in.");
           System.out.println("\nWalk Forward | Wait");
           option1 = input.nextLine();
           
           if (option1.equals("wait")) {
              System.out.println("Yeeesss, really, really worth it being here in the room. A room so utterly captivating that even though all your co-workers have mysteriously vanished, here you sit looking at these chairs and some paintings. Really worth it.");
              System.out.println("\nWalk Forward | Wait");
              option1 = input.nextLine(); 
              
              if (option1.equals("wait")) {
                System.out.println("At this point, Stanley's obsession with this room bordered on creepy, and reflected poorly on his overall personality. It's possible that this is why everyone left.");
                System.out.println("\nWalk Forward | Wait");
                option1 = input.nextLine();
                
                if (option1.equals("wait")) {
                  System.out.println("Stanley sat around waiting for more dialogue, but when a long time had passed and there was no more, he decided that the game was trying to send him a message.");
                  System.out.println("\nWalk Forward");
                  option1 = input.nextLine();
                  System.out.println("But eager to get back to business, Stanley took the first open door on his left.");
                  System.out.println("\nLeft Door | Forward");
                  option1 = input.nextLine();
                  
                  if (option1.equals("forward")) {
                  //forward method
                  } else {
                  // left door method
          }
        } else {
          System.out.println("But eager to get back to business, Stanley took the first open door on his left.");
          System.out.println("\nLeft Door | Forward");
          option1 = input.nextLine();
       
          if (option1.equals("forward")) {
          //forward method
          } else {
          // left door method
          }
        }
      } else {
        System.out.println("But eager to get back to business, Stanley took the first open door on his left.");
        System.out.println("\nLeft Door | Forward");
        option1 = input.nextLine();
       
        if (option1.equals("forward")) {
        //forward method
        } else {
        // left door method
        }
      }            
    } else {
      System.out.println("But eager to get back to business, Stanley took the first open door on his left.");
      System.out.println("\nLeft Door | Forward");
      option1 = input.nextLine();
       
      if (option1.equals("forward")) {
      //forward method
      } else {
      // left door method
      }
    }             
  } else {
    System.out.println("Coming to a staircase, Stanley walked upstairs to his boss's office.");
    System.out.println("\nUp Stairs | Down Stairs");
    option1 = input.nextLine();
       
    if (option1.equals("up stairs")) {
    upStairsmethod();
    } else {
    System.out.println("dream state");
    }
  }               
}                 
    void openingmethod() {
        Scanner input;
        input = new Scanner(System.in);
        util thread = new util();
        String option1;
        String skip;
        System.out.println("Skip intro? y/n");
        skip = input.nextLine();
        if (skip.equals("y")) {
            System.out.println("Stanley got up from his desk and stepped out of his office.");
            System.out.println("\nWalk Out | Close Door");
            option1 = input.nextLine();

            if (option1.equals("close door")) {
                closeDoormethod();
            } else {
                System.out.println("All of his co-workers were gone. What could it mean? Stanley decided to go to the meeting room; perhaps he had simply missed a memo.");
                System.out.println("\nWalk Forward | Look Around | Wait");
                option1 = input.nextLine();
                
                if (option1.equals("wait")) {
                  System.out.println("Stanley just stood there doing nothing at all. He seems to think I have nothing better to do with my time than to sit around and describe every facinating little detail of his inability to do anything.");
                  thread.wait(4000);
                  System.out.println("This is why Stanley and I are on such good terms.");
                  System.out.println("\nWalk Forward | Look Around");
                  option1 = input.nextLine();
                     
                  if(option1.equals("look around")) {
                     System.out.println("No matter how hard Stanley looked, he couldn't find a trace of his co-workers.");
                     System.out.println("\nWalk Forward");
                     option1 = input.nextLine();
                     doorChoicemethod();
                   } else {
                     doorChoicemethod();
                     }
                 } else {
                     if(option1.equals("look around")) {
                     System.out.println("No matter how hard Stanley looked, he couldn't find a trace of his co-workers.");
                     System.out.println("\nWalk Forward | Wait");
                     option1 = input.nextLine();
                        if (option1.equals("wait")) {
                            System.out.println("Stanley just stood there doing nothing at all. He seems to think I have nothing better to do with my time than to sit around and describe every facinating little detail of his inability to do anything.");
                            thread.wait(4000);
                            System.out.println("This is why Stanley and I are on such good terms.");
                            System.out.println("\nWalk Forward");
                            option1 = input.nextLine();
                            doorChoicemethod();
                         } else {
                         doorChoicemethod();
                         }
                      } else {
                       doorChoicemethod();
                     }

                }
            }

         } else {
            System.out.println("This is a story about a man named Stanely.");
            thread.wait(3000);
            System.out.println("Stanley worked for a company in a big building where he was Employee #427.");
            thread.wait(5000);
            System.out.println("Employee #427's job was simple: he sat at his desk in Room 427 and he pushed buttons on a keyboard.");
            thread.wait(7500);
            System.out.println("Orders came to him through a monitor on his desk telling him what buttons to push, how long to push them, and in what order.");
            thread.wait(6500);
            System.out.println("This is what Employee #427 did every day of every month of every year, and although others may have considered it soul rending,");
            thread.wait(6750);
            System.out.println("Stanley relished every moment that the orders came in, as though he had been made exactly for this job.");
            thread.wait(5000);
            System.out.println("And Stanley was happy.");
            thread.wait(5000);
            System.out.println("And then one day, something very peculiar happened.");
            thread.wait(3000);
            System.out.println("Something that would forever change Stanley;");
            thread.wait(3000);
            System.out.println("Something he would never quite forget.");
            thread.wait(3000);
            System.out.println("He had been at his desk for nearly an hour when he had realized not one single order had arrived on the monitor for him to follow.");
            thread.wait(6500);
            System.out.println("No one had shown up to give him instructions, call a meeting, or even say 'hi'.");
            thread.wait(5500);
            System.out.println("Never in all his years at the company had this happened, this complete isolation.");
            thread.wait(4000);
            System.out.println("Something was very clearly wrong. Shocked, frozen solid, Stanley found himself unable to move for the longest time.");
            thread.wait(5000);
            System.out.println("But as he came to his wits and regained his senses, he got up from his desk and stepped out of his office.");
            thread.wait(4500);
            System.out.println("\nClose Door | Walk Out");
            option1 = input.nextLine();

            if (option1.equals("close door")) {
                closeDoormethod();
            } else {
                System.out.println("All of his co-workers were gone. What could it mean? Stanley decided to go to the meeting room; perhaps he had simply missed a memo.");
                System.out.println("\nWalk Forward | Look Around | Wait");
                
                option1 = input.nextLine();
                
                if (option1.equals("wait")) {
                  System.out.println("Stanley just stood there doing nothing at all. He seems to think I have nothing better to do with my time than to sit around and describe every facinating little detail of his inability to do anything.");
                  thread.wait(4000);
                  System.out.println("This is why Stanley and I are on such good terms.");
                  System.out.println("\nWalk Forward | Look Around");
                  option1 = input.nextLine();
                     
                  if(option1.equals("look around")) {
                     System.out.println("No matter how hard Stanley looked, he couldn't find a trace of his co-workers.");
                     System.out.println("\nWalk Forward");
                     option1 = input.nextLine();
                     doorChoicemethod();
                   } else {
                     doorChoicemethod();
                     }
                 } else {
                     if(option1.equals("look around")) {
                     System.out.println("No matter how hard Stanley looked, he couldn't find a trace of his co-workers.");
                     System.out.println("\nWalk Forward | Wait");
                     option1 = input.nextLine();
                        if (option1.equals("wait")) {
                            System.out.println("Stanley just stood there doing nothing at all. He seems to think I have nothing better to do with my time than to sit around and describe every facinating little detail of his inability to do anything.");
                            thread.wait(4000);
                            System.out.println("This is why Stanley and I are on such good terms.");
                            System.out.println("\nWalk Forward");
                            option1 = input.nextLine();
                            doorChoicemethod();
                         } else {
                         doorChoicemethod();
                         }
                      } else {
                       doorChoicemethod();
                      }
               }
         }
      }
   }
}
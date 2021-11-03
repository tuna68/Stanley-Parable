import java.util.*;

public class StanleyParable{
   public static void main(String[] args){
   Scanner input;
   input = new Scanner(System.in);      
   System.out.println("  _____ _____ _____    _____ _____ _____ _____ __    _____ __ __    _____ _____ _____ _____ _____ __    _____ \n |_   _|  |  |   __|  |   __|_   _|  _  |   | |  |  |   __|  |  |  |  _  |  _  | __  |  _  | __  |  |  |   __| \n   | | |     |   __|  |__   | | | |     | | | |  |__|   __|_   _|  |   __|     |    -|     | __ -|  |__|   __| \n   |_| |__|__|_____|  |_____| |_| |__|__|_|___|_____|_____| |_|    |__|  |__|__|__|__|__|__|_____|_____|_____| ");               
   gameplay stanley = new gameplay();
   util thread = new util();
   thread.wait(4000);
   System.out.println("\n\n\n\nBefore playing, please type each option exactly as you see it, in all lowercase.");
   System.out.println("The game will not function if you type with capitals/mispell.");
   thread.wait(5000);
   stanley.mainMenumethod();
   
      }
}
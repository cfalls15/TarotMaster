import java.util.Scanner;
import java.util.Random;
public class TarotMaster
{
  public static void main(String[] args)
  {
      //Game g = new Game();
      //g.play();
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Tarot Master.  Have you had your tarot cards read before? (y/n)");
    String answer = new String(kb.nextLine().toLowerCase());
    
    if (answer.equals("y") || answer.equals("yes"))
      {
        System.out.println("Then let's begin.");
      }
    if (answer.equals("n") || answer.equals("no"))
      {
        System.out.println("Let me explain.  The setup we're going to use today is blah blah blah.");
      }
    
    Random randomOne = new Random();
     //pick three random numbers
        int firstRandom = randomOne.nextInt(78);
        int secondRandom = randomOne.nextInt(78);
        int thirdRandom = randomOne.nextInt(78);
  
        
          
        
      //find the cards that relate to those numbers
      //announce the cards to the player
      
  }
}
package javaLangg;
import java.util.Random;
import java.util.Scanner;
class Game
{
  int number;
  int inputNumber;
  int noOfGuesses =0;

   int getNoOfGuesses() 
   {
      return noOfGuesses;
   }
   void setNoOfGuesses(int noOfGuesses) 
   {
    this.noOfGuesses = noOfGuesses;
   }
   Game()
   {
    Random rand = new Random();
    number = rand.nextInt(100);
    System.out.println(number);
   }
   void takeUserInput()
   {
     System.out.println("Guess the number");
     Scanner sc = new Scanner(System.in);
     inputNumber = sc.nextInt();
   }
   boolean isCorrectNumber()
   {
     noOfGuesses++;
     if (inputNumber==number)
     {
       System.out.println("Yes ,You Guessed it right, it was "+number);
       System.out.println("You Guessed it in " +noOfGuesses + " attempts.");
       System.exit(0);
     }
     else if(inputNumber<number)
     {
    	System.out.println("Too low...");
       takeUserInput();
     }  
     else if(inputNumber>number)
     {
    	 System.out.println("Too high...");
         takeUserInput();
     }      
       return false;
   }
   public static void main(String[] args) 
   {
     Game g = new Game();
     boolean b= false;
     while(!b)
     {
       g.takeUserInput();
       b = g.isCorrectNumber();
    }  
   }
}
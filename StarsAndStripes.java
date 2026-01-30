//� A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 1 - 29 - 26
//Class - Computer Science I
//Lab  - Write methods for class Stars and Sripes.

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      System.out.println("********************");
   }

   public void printTwentyDashes()
   {
      System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      System.out.println();
      System.out.println();
   }
   
   public void printASmallBox()
   {	
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
      printASmallBox();
      printASmallBox();
   }   
}
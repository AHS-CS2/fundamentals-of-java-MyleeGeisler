//� A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 1 - 30 - 26
//Class - Computer Science I
//Lab  - Call the methods created in the StarsAndStripes file.

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes america = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
      america.printASmallBox();
      america.printTwoBlankLines();
      america.printABigBox();
   }
}
/* Program: ChargeAccountValidationClass
   Date: March 30, 2018
   Author: Jonathan Price
   
   This class is designed to be used with a
   program called ChargeAccountValidationProgram,
   which is designed to use this class to hold
   an array of 18 account numbers from Programming
   Challenge 7-3 of Tony Gaddis' sixth edition of 
   the textbook "Starting Out With Java", asks the 
   user to input an account number to be tested as 
   valid, and display the appropriate result. When 
   the program is executed, it will ask the user
   to input a seven-digit account number, compare
   the user's input with the array of account numbers,
   then display whether or not there is a match. After 
   being executed, the program associated with this 
   class needs the user to input an account number when
   prompted.
*/

public class ChargeAccountValidationClass
{
   //Define an array of integers for the account numbers
   private int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                                   8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                                   1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
   
   //Check user input
   public boolean ifValidAccount(int account_input)
   {
      for (int index = 0; index < accountNumbers.length; index++)
      {
         if (account_input == accountNumbers[index])
         {
            //Return true if the input equals an account number
            return true;
         }
      }
      
      //Return false if the input does not equal an account number
      return false;
      
   }
}
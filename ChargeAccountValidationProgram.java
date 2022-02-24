/* Program: ChargeAccountValidationProgram
   Date: March 30, 2018
   Author: Jonathan Price
   
   This program called is designed to use a class 
   called ChargeAccountValidationClass to hold an 
   array of 18 account numbers from Programming
   Challenge 7-3 of Tony Gaddis' sixth edition of 
   the textbook "Starting Out With Java", asks the 
   user to input an account number to be tested as 
   valid, and display the appropriate result. When 
   the program is executed, it will ask the user
   to input a seven-digit account number, compare
   the user's input with the array of account numbers,
   then display whether or not there is a match. After 
   being executed, the program needs the user to input 
   an account number when prompted.
*/

import java.util.Scanner;  //Needed for the Scanner class

public class ChargeAccountValidationProgram
{
   public static void main(String[] args)
   {
      //Read the user's keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Hold the user's input
      int user_input;
      
      //Create object for the array of account numbers
      ChargeAccountValidationClass accountArray = new ChargeAccountValidationClass();
      
      //Get an account number from the user
      System.out.println("Please enter a seven-digit account number to validate. ");
      user_input = keyboard.nextInt();
      
      //Check if user's input is a valid account number
      if (accountArray.ifValidAccount(user_input))
      {
         //Alert user that the input is a valid account number
         System.out.println(user_input + " is valid account number!");
      }
      else
      {
         //Alert user that the input is not a valid account number
         System.out.println(user_input + " is not a valid account number!");  
      }
   }
}
/*
 * Aarav Goyal
 * 10/11/2023
 * Do While Worksheet
 */

import java.util.Scanner;
class Q1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int randNum, input, timestried;
    String playing;

    do {
      timestried = 1;
      randNum = (int)(Math.random()*100+1);
      //System.out.println(randNum);
      //Turn on when you want to see output of the random number
      System.out.println("What do you think the number is?");
      input = in.nextInt();
      do {

        if (randNum>input){
          System.out.println("Your number is lower than the random number.");
          System.out.println("Enter a number again.");
          input = in.nextInt();
          timestried++;
        }
        else if (randNum<input){
          System.out.println("Your number is higher than the random number.");
          System.out.println("Enter a number again.");
          input = in.nextInt();
          timestried++;
        } 



      } while (input != randNum);
      if (timestried==1) {
        System.out.println("You got it correct in 1 attempt the number is: " + randNum);
      }
      else {
        System.out.println("You got it correct in " + (timestried) + " attempts the number is: " + randNum);

      }
      System.out.println("Do you want to play again?");
      in.nextLine();
      playing = in.nextLine();
      do {
        if (playing.equalsIgnoreCase("No")){
          //Do nothing, code will show at the end
        }
        else if (playing.equalsIgnoreCase("Yes")){
          System.out.println("Ok");
        }
        else {
          System.out.println("Do you want to play again, write your answer in the form of Yes or no.");
          playing = in.nextLine();
        }
      } while (!playing.equalsIgnoreCase("Yes") && !playing.equalsIgnoreCase("No"));

    } while (playing.equalsIgnoreCase("Yes"));
    System.out.println("Thank you for playing");

  }
}



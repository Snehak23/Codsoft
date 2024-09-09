/*NUMBER GAME */
import java.util.*;
import java.util.random.*;
public class task1{
    public static void guessNumberGame(){
        Scanner sc = new Scanner(System.in);
        //for generating the random number
        int num = 1+ (int)(100*Math.random());
        //give this much chances
        int chances = 10;
        System.out.println("Hey buddy Lets start the game"
                       +" A number is choosed between 1 to 100 "
                       +"Now guess the number within 5 trials."
                       +"Have fun :) ");
        int i =0, guess;
        while(i<chances){
            System.out.println("Guess the number");
            //take input from user for guessing
            guess = sc.nextInt();

            //if the number is guessed 
            if(num == guess){
                System.out.println("Congratlations! YOU GUESSED THE NUMBER");
                break;

            }
            else if(num>guess && i!= chances -1){
                System.out.println("The number is greater than "+guess);
            }
            else if(num<guess && i!= chances-1){
                System.out.println("The number is less than "+guess);
            }
            i++;
        }
        if(i == chances){
            System.out.println("You are out of chances :( , BETTER LUCK NEXT TIME");
            System.out.println("The number was "+num);

        }
    }
    public static void main(String arg[]){
        guessNumberGame();

    }
}
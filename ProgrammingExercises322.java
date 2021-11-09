package programming.exercises.pkg3.pkg22;

import java.util.Scanner;
import java.util.Random;

public class ProgrammingExercises322 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 0-2: ");
        int you = inp.nextInt(); 
        Random rand = new Random();
        int comp = rand.nextInt();
        String t="",d="",f="";
        switch (comp){
            case 0: f="scissor"; break;
            case 1: f="rock"; break; 
            case 2: f="paper";
        }
        switch (you){
            case 0: d="scissor"; break;
            case 1: d="rock"; break; 
            case 2: d="paper";            
        }
        if(comp == you){
            t="It is a draw";
            d=f+" too";
        }
        else if((comp == 0 && you == 1) || (comp == 1 && you == 2) || (comp == 2 && you == 0)){
            t="You won";
        }else{
            t="You lose";
        }
        System.out.println("The computer is " + f + ". You are " + d + ". " + t);
    }
    
}

package programming.exercises.pkg3.pkg5;

import java.util.Scanner;

public class ProgrammingExercises35 {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Enter today`s day: ");
    int day = inp.nextInt();
    System.out.print("Enter the number of days elapsed since today:");
    int days = inp.nextInt();    
    String d = "", f = "";
    switch (day % 7){
        case 0: d="Sunday"; break;
        case 1: d="Monday"; break; 
        case 2: d="Tuesday"; break;
        case 3: d="Wednesday"; break;
        case 4: d="Thursday"; break;
        case 5: d="Friday"; break;
        case 6: d="Saturday";
    }
    switch ((day + days) % 7){
        case 0: f="Sunday"; break;
        case 1: f="Monday"; break; 
        case 2: f="Tuesday"; break;
        case 3: f="Wednesday"; break;
        case 4: f="Thursday"; break;
        case 5: f="Friday"; break;
        case 6: f="Saturday";
    }
    System.out.println("Today is " + d + " `and the future day is " + f);
    
    
    }
    
}

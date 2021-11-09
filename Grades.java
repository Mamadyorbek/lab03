package grades;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Number of points? ");
        int points = inp.nextInt();
        
        if(points > 100)
            System.out.println(+ points + " is not in the permitted range");
        else if(points >= 90)
            System.out.println("Grade: A");
        else if(points > 100)
            System.out.println(+ points + "is not in the permitted range");
        else if(points < 90 && points >= 80)
            System.out.println("Grade: B");
        else if(points < 80 && points >= 70)
            System.out.println("Grade: C");
        else if(points < 70 && points >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
        
        }
        
    }
    


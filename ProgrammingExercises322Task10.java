package programming.exercises.pkg3.pkg22.task10;

import java.util.Scanner;

public class ProgrammingExercises322Task10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = inp.nextInt();
        double y = inp.nextInt();
        double z = (x * x) + (y * y);
        double dist = Math.pow(z, 0.5);
        
        if(dist > 10)
            System.out.println("Point " + "(" + x + ", " + y + ") " + "is not in the circle");
        else
            System.out.println("Point " + "(" + x + ", " + y + ")" + " is in the circle");
            
        
    }
    
}

package leap.years;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Year? ");
        int years = inp.nextInt();
        
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0 ) {
            System.out.println("This is a leap year.");
        }else{
            System.out.println("This is not a leap year.");
        }
    }
    
}

package the.maximum.value.between.three.numbers;
import java.util.Scanner;
public class TheMaximumValueBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1st number? ");
        int a = inp.nextInt();
        System.out.print("2nd number? ");
        int b = inp.nextInt();
        System.out.print("3rd number? ");
        int c = inp.nextInt();
        if (a > b && a > c ) 
            System.out.println("The value " + a + " is the greatest one");
        else if (b > a && b > c)
            System.out.println("The value " + b + " is the greatest one");
        else  
            System.out.println("The value " + a + " is the greatest one");
        
    }
    
}

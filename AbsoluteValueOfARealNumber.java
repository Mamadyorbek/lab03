package absolute.value.of.a.real.number;
import java.util.Scanner;
public class AbsoluteValueOfARealNumber {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print(" Some real number? ");
       double number = inp.nextDouble();
       double absolute = Math.abs(number);
       System.out.println("|" + number + "|" + " = " + absolute);
    }
             
} 

                
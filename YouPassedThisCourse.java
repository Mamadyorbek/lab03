package you.passed.pkgthis.course;
import java.util.Scanner;
public class YouPassedThisCourse {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print("Number of points? ");
       int points = inp.nextInt();
       if (points >= 40) { 
           System.out.println("You passed “Structured Programming”!!!");
           System.out.println("You should take “Object-Oriented Programming” in the next semester");
       }
       else {
           System.out.println("You failed “Structured Programming”!!!");
           System.out.println("You can take it again in the fall semester next year");
       }
    }
    
}

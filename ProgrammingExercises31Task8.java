package programming.exercises.pkg3.pkg1.task8;

import java.util.Scanner;

public class ProgrammingExercises31Task8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        int w = inp.nextInt();
        String str = "";
        if(w > 0 && w <= 2){
            str = "2.5";
        }else if(w > 2 && w <= 4){
            str = "4.5";
        }else if(w > 4 && w <= 10){
            str = "7.5";
        }else if(w > 10 && w <= 20){
            str = "10.5";
        }else{
            str = "cannot be shipped";
        }
        System.out.println("The shipping cost is " + str);
    }
    
}

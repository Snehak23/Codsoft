/*STUDENT GRADE CALCULATOR */
import java.util.*;
public class task2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" hey student this is simple grade calculator for your each subject marks :)");
        System.out.println("Enter your marks Between 1 & 100");
        System.out.println("1. MATH ");
        float MAth = sc.nextFloat();
        System.out.println("2. CHEMISTRy ");
        float CHEMISTRY = sc.nextFloat();
        System.out.println("3. PHYSICS ");
        float PHYSICS = sc.nextFloat();
        System.out.println("4 HINDI ");
        float HINDI = sc.nextFloat();
        System.out.println("5.ENGLISH ");
        float ENGLISH = sc.nextFloat();
        float totalMarks = MAth+CHEMISTRY+PHYSICS+HINDI+ENGLISH;
        float totalNumber = 500;
        float percentile = (totalMarks/totalNumber)*100;
        System.out.println("Your total marks are "+ totalMarks );
        System.out.println("Your Avg percentile is " +percentile +"%" );
        
        if(percentile>=80 && percentile<=100){
            System.out.println("your Grade is A+ ");
        }
        else if(percentile>=70 && percentile<80){
            System.out.println("Your Grade is A");
        }
        else if(percentile>=60 && percentile < 70){
            System.out.println("Your Grade is B+");
        }
        else if(percentile>=50 && percentile<60){
            System.out.println("Your Grade is B ");
        }
        else if(percentile>=33 && percentile<50){
            System.out.println("Your grade is C+");
        }
        else{
            System.out.println("Sorry Buddy You are Fail :(");
        }
    


    }
}
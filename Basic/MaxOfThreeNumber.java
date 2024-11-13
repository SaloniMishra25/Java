package Basic;
import java.util.*;

public class MaxOfThreeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter three number : ");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if (num1>=num2) {
            if(num1>num3) {
                System.out.println("First number is greater : " +num1);
            }
            else {
                System.out.println("Third number is greater : " + num3);
            }
        }
        else {
            if(num2>num3) {
                System.out.println("Second number is greater : " +num2);
            }
            else {
                System.out.println("Third number is greater : " + num3);
            }
        }
        
    }
}
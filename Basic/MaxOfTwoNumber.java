package Basic;

import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class MaxOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>=num2) {
           System.out.print("First number  is greater : " + num1);
        }
        else {
            System.out.print("Second number is  greater : " + num2);
        }
    }
}
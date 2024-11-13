package Basic;

import java.util.*;

public class Percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks ");
        System.out.print("Maths : ");
        int math = sc.nextInt();
        System.out.print("Chemistry : ");
        int chem = sc.nextInt();
        System.out.print("Physics : ");
        int phy = sc.nextInt();
        System.out.print("Hindi : ");
        int hindi = sc.nextInt();
        System.out.print("English: ");
        int english = sc.nextInt();

        int total = (math + phy + chem + hindi + english) ;
        float per = (total/5) * 100;
        System.out.println("Percentage : " + per+ "%");

    }
}
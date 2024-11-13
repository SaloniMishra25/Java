package Basic;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        System.out.print("Enter radius : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float pi = 3.14f;
        double area = pi * r * r;

        System.out.println("Area of circle : " + area);

    }
}
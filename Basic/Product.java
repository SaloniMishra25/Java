package Basic;
import java.util.*;


public class Product {
public static void main(String args[]) {
    System.out.println("Enter two number : ");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product = a*b;
    System.out.print("Product of two number : "+product);
}
}
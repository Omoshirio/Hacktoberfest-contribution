import java.util.*;

public class func {

    public static void main(String[] args) {
        // Q1. take input of 2 number and print the sum

        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;

        System.out.println("The sum is = " + sum);

        sc.close();
    }
}

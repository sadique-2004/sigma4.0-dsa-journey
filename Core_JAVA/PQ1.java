// Question1: Average of N numbers 

import java.util.Scanner;

public class PQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;
        int Average = sum / 3; // Average of 3 numbers
        System.out.println("The average of the 3 numbers is: " + Average);

    }
}

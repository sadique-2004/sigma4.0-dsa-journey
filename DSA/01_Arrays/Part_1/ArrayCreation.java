//  opearation on array
// 1. Array Creation

import java.util.*;;

public class ArrayCreation {

    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
         
        // int marks [] = new int [5]; // array creation with size 5
        // int number [] = {1, 2, 3, 4, 5}; // array creation with initialization
        // String frouts [] = {"apple", "banana", "orange"}; // array creation with initialization

        System.out.println("How many sem you have completed: ");
        int sem = sc.nextInt();

        float sgpa [] = new float[sem]; // array creation with size 8
        System.out.println("Enter your FIrst sem sgpa: ");
        sgpa[0] = sc.nextFloat();
        System.out.println("Enter your Second sem sgpa: ");
        sgpa[1] = sc.nextFloat();
        System.out.println("Enter your Third sem sgpa: ");
        sgpa[2] = sc.nextFloat();
        System.out.println("Enter your Fourth sem sgpa: ");
        sgpa[3] = sc.nextFloat();

        float cgpa = (sgpa[0] + sgpa[1] + sgpa[2] + sgpa[3]) / 4; // cgpa calculation

        System.out.println("Your cgpa is till "+ sem+ " sem is : " + cgpa); // cgpa print
        
        
    }
}
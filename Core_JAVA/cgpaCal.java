import java.util.*; // Importing the Scanner class for user input

public class cgpaCal {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Please enter your name: ");
        String name = sc.nextLine(); // Reading the user's name
        System.out.println("How many sem you have completed: ");
        int sem = sc.nextInt(); // Reading the number of semesters completed

        float sgpa[] = new float[sem]; // Array to store SGPA for each semester
        

        for(int i=0; i<sem; i++){
            System.out.println("Please enter your SGPA of semester " +(i+1)+ ": ");
            sgpa[i] = sc.nextFloat(); // Reading SGPA for each semester
        }

        float sum = 0; // Variable to store the sum of SGPA
        for(int i=0; i<sem; i++){
            sum += sgpa[i]; // Adding each SGPA to the sum
        }

        float cgpa = sum / sem; // Calculating CGPA
        System.out.println("Your CGPA is: " + cgpa); // Displaying CGPA

        if (cgpa<= 7.0){
            System.out.println("Sorry " + name + ", you are not eligible for placement"); // Message if CGPA is less than or equal to 7.0
        } else {
            System.out.println("Congratulations " + name + ", you are eligible for placement"); // Message if CGPA is greater than 7.0

            if (cgpa >= 9.0) {
                System.out.println("You are eligible for all companies"); // Message if CGPA is greater than or equal to 9.0
            } else {
                System.out.println("You are eligible for some companies"); // Message if CGPA is less than 9.0
        }
            
        }
    }
}

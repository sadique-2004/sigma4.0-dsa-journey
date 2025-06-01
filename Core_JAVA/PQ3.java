import java.util.*;

public class PQ3 {
    public static void main ( String args [] ) {
        byte b = 4;
        char c = 'A';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = b + c + s + i + f + d; // Implicit type conversion to double
        System.out.println("The result of the expression is: " + result);

        int intResult  = (int) ( b + c + s + i + f + d); 
        System.out.println("The result of the Explicit conversion is :" + intResult);

    }
    
}

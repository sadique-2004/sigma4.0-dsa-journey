import java.util.*;

public class input {

    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
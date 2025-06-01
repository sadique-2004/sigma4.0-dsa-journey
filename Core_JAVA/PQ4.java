import java.util.Scanner;

public class PQ4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enyter pencil price: ");
        float pencilPrice = sc.nextFloat();
        System.out.println("Please enter eraser price: ");
        float eraserPrice = sc.nextFloat();
        System.out.println("Please enter sharpener price: ");
        float sharpenerPrice = sc.nextFloat();

        float totalPrice = pencilPrice + eraserPrice + sharpenerPrice;
        System.out.println("The total price of the items is: " + totalPrice);

        //  total with 18 % GST
        float gst = totalPrice + (totalPrice * 0.18f);
        System.out.println("The total price with 18% GST is: " + gst);

    }
}

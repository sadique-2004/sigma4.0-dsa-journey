public class typecast {
    public static void main (String args[]){
        // Declare a variable of type float
        float marks = 99.99f;

        int intMarks = (int) marks; // Type casting float to int

        System.out.println("Marks in float: " + marks);
        System.out.println("Marks in int: " + intMarks);


        //  type conversion for char to int
        char ch1 = 'A';
        char ch2 = 'B';
        int asciiValue = ch1; 
        int asciiValue1 = ch2; 
        System.out.println("Character: A-asciiValue " + asciiValue + "\n Character: B-asciiValue " + asciiValue1);
    }
}

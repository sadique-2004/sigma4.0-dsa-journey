// only array values are passed by reference in Java, not the array itself.
// This means that if you modify the contents of the array in a method, those changes will be reflected in the original array.

public class PassByRef {

    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // increment each mark by 1
        }

    }

    public static void main(String[] args) {
        int marks[] = { 99, 98, 97, 96, 95 };

        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks after update: " + marks[i]);
        }
    }
}

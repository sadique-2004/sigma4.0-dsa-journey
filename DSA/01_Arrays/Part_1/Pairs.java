public class Pairs {

    public static void printPairs(int[] numbers, int target) {
        int tp=0; // Total Pairs
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;

                // int sum = current + numbers[j];
                // if( sum == target){
                // System.out.print("(" + current + "," + numbers[j] + ")");
                // }
            }
            System.out.println("");
        }
        System.out.println("Total pairs: "+tp);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        int target = 6;

        System.out.println("Pairs in the array are: ");
        printPairs(number, target);

        System.out.println("Total Pairs: " + (number.length * (number.length - 1) / 2));
    }
}

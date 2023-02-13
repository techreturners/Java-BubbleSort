import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // bubble sort =    pairs of adjacent elements are compared,
        //                  and the elements are swapped if they are not in order
        //
        //                  Quadratic time O(n^2)
        //                  small data set = okay-ish
        //                  large data set = BAD

        long startTime;
        long endTime;
        double elapsedTime;

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }

        System.out.println("Unsorted input: ");
        for (int i : array) System.out.println(i);

        startTime = System.nanoTime();
        bubbleSort(array);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("----------------------------");

        System.out.println("Sorted output: ");
        for (int i : array) System.out.println(i);

        System.out.println("Time taken:\t" + elapsedTime + " ns");

    }

    public static void bubbleSort(int array[]) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapped = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
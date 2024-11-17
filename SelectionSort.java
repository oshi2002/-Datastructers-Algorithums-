
package selectionsort;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSortAscending(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
        // Method to perform selection sort in descending order
    public static void selectionSortDescending(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the first element of the unsorted part
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
                                                        // hardcode array  int[] numbers = {2,7,5,8,4,1};
        // Read 8 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Sort and display in ascending order
        System.out.println("\nAscending order:");
        selectionSortAscending(numbers);
        for (int number : numbers) {
             System.out.print(number + " ");
        }
         // Sort and display in descending order
        System.out.println("\nDescending order:");
        selectionSortDescending(numbers);
        for (int number : numbers) {
             System.out.print(number + " ");
        }
    }
    
}

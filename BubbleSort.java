package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void assending(int[]array){
         int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {  // Modify comparison for ascending order
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void dessending(int[]array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {  // Modify comparison for descending order
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        
        // Read 8 numbers from the user
        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Sort and display in ascending order
        System.out.println("\nAscending order:");
        assending(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Sort and display in descending order
        System.out.println("\n\nDescending order:");
        dessending(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
    


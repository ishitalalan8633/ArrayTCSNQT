// left rotate array by one place

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.split(",");
        int[] arr = new int[values.length];

        // Convert input to integer array
        for (int i = 0; i < values.length; i++) {
            try {
                arr[i] = Integer.parseInt(values[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error occurred while parsing input.");
                return; // Exit if parsing fails
            }
        }
        int[] result = leftRotate(arr);

        // Print the result array using a custom method
        printArray(result); 
    }

    // Function to left rotate an array
    public static int[] leftRotate(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        int temp = arr[0]; // Save the first element
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // Shift all elements to the left
        }
        arr[n - 1] = temp; // Place the first element at the end

        return arr;
    }

    // Custom method to print array using a for-loop
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");  // Print a comma after each element except the last
            }
        }
        System.out.println("]");
    }
}

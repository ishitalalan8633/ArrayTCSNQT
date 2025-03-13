import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] values = input.split(" ");
    int[] arr = new int[values.length];
     for (int i = 0; i < values.length; i++) {
            try {
                arr[i] = Integer.parseInt(values[i]); // Trim spaces and parse the integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + values[i] + "' is not a valid number.");
            }
        }
    int target = findLargestElement(arr);
    System.out.println("Largest is" +" " +target);
    int result = findSmallestElement(arr);
    System.out.println("smallest is" +" "+result);

}
public static int findLargestElement(int arr[]){
    int largest = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    return largest;
    
}
public static int findSmallestElement(int arr[]){
    int smallest = arr[0];
    for(int i=0; i<arr.length;i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    return smallest;
}
}

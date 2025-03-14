// move zeros to the end 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[]values = input.split(",");
		int[]arr = new int[values.length];
		try{
		    for(int i=0; i<arr.length; i++){
		        arr[i] = Integer.parseInt(values[i]);
		    }
		  }catch(NumberFormatException e){
		      System.out.println("error occured");
		  }
		  moveZeros(arr);
		  printArray(arr);
		  
	}
	public static void moveZeros(int arr[]){
	    int j = 0;
	    for(int i=0; i<arr.length;i++){
	        if(arr[i] != 0){
	            if(i!=j){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	            j++;
	        }
	    }
	}
	
	public static void printArray(int arr[]){
	    System.out.print("[");
	    for(int i=0; i<arr.length;i++){
	        System.out.print(arr[i]);
	        if(i<arr.length-1){
	            System.out.print(",");
	        }
	    }
	    System.out.print("]");
	}
}

// remove duplicates from a sorted array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String[]values = input.split(",");
	    int [] arr = new int[values.length];
	    for(int i=0;i<values.length;i++){
	        try{
	            arr[i] = Integer.parseInt(values[i]);
	        }catch(NumberFormatException e){
	            System.out.println("error occured");
	        }
	    }
	    int i = 0;
	    for(int j=1; j<arr.length;j++){
	        if(arr[j] != arr[i]){
	            i++;
	            arr[i] = arr[j];
	        }
	    }
     System.out.print("[");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]);
            if (k < i) {
                System.out.print(", "); // Add comma between elements
            }
        }
        System.out.print("]");
	}
}

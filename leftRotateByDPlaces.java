// left rotate by D places in an array
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
		  int k = sc.nextInt();
		  leftRotate(arr,k);
		  //System.out.println(Arrays.toString(arr));
		  printArray(arr);
	}
	public static void leftRotate(int arr[],int k){
	    k = k%arr.length;
	    reverse(arr,0,k-1);
	    reverse(arr,k,arr.length-1);
	    reverse(arr,0,arr.length-1);
	    
	   
	}
	public static void reverse(int arr[],int start,int end){
	     
	  while(start < end){
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
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

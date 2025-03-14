// Linear Search
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
		  int num = sc.nextInt();
		  int result = linearSearch(arr,num);
		  System.out.println(result);
		  
		  
	}
	public static int linearSearch(int arr[], int num){
	    for(int i=0; i<arr.length;i++){
	        if(num == arr[i]){
	            return i+1;// for 1 based index or return i for zero based index
	        }
	    }
	    return -1;
	}
	
	
}

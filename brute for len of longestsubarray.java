//longest subarray with sum k
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] values = input.split(",");
		int arr[] = new int[values.length];
		for(int i=0; i<values.length;i++){
		    arr[i] = Integer.parseInt(values[i]);
		}
		int k = sc.nextInt();
		int result = getLongSubarray(arr,k);
		System.out.println(result);
	}
	public static int getLongSubarray(int[]arr, int k){
	    int max = 0;
	    for(int i=0; i<arr.length;i++){
	        int sum = 0;
	        for(int j=i;j<arr.length;j++){
	            sum = sum + arr[j];
	            if(sum == k){
	           max = Math.max(max,j-i+1);
	        }
	        }
	       
	    }
	    return max;
	}
}

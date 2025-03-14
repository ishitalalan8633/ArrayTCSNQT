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
	    HashMap<Integer,Integer> freq = new HashMap<>();
	    int max = 0;
	    int sum = 0;
	    freq.put(0,-1);
	    for(int i=0; i<arr.length;i++){
	        sum = sum + arr[i];
	        if(sum == k){
	            max = Math.max(max,i+1);
	        }
	        if(freq.containsKey(sum - k)){
	            int len = i-freq.get(sum-k);
	            max = Math.max(max,len);
	        }
	        if(!freq.containsKey(sum)){
	            freq.put(sum,i);
	        }
	        
	    }
	    return max;
	}
}

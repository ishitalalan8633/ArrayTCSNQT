//appears once no
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
		int result = appearsOnce(arr);
		System.out.println(result);
	}
	public static int appearsOnce(int[]arr){
	    int xor1 = 0;
	    for(int i=0; i<arr.length; i++){
	        xor1 = xor1 ^ arr[i];
	    }
	    return xor1;
	}
}

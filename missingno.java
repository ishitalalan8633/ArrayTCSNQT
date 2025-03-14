// Find missing no

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N-1];
		for(int i=0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		int result = findMissing(N,arr);
		System.out.println(result);
	}
	public static int findMissing(int N, int arr[]){
	    int sum = (N*(N+1))/2;
	    int sum2 = 0;
	    for(int i=0; i<arr.length;i++){
	        sum2 = sum2 + arr[i];
	    }
	    return sum - sum2;
	}
}

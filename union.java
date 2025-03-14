//  find union 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String input = sc.nextLine();
	   String []values1 = input.split(",");
	   int a[] = new int[values1.length];
	 
	   for(int i=0; i<values1.length;i++){
	           a[i] = Integer.parseInt(values1[i]);
	       }
	   
	   String input1 = sc.nextLine();
	   String []values2 = input1.split(",");
	   int b[] = new int[values2.length];
	  
	   for(int i=0; i<values2.length;i++){
	          b[i] = Integer.parseInt(values2[i]);
	       }
	   
	   ArrayList<Integer> union = findUnion(a,b);
	   System.out.println(union);
	   
	   
	}
	public static ArrayList<Integer> findUnion(int a[], int b[]){
	    HashSet<Integer> freq = new HashSet<>();
	    for(int i=0; i<a.length;i++){
	        freq.add(a[i]);
	    }
	    for(int i=0; i<b.length;i++){
	        freq.add(b[i]);
	    }
	    ArrayList<Integer> arr = new ArrayList<>(freq);
	    Collections.sort(arr);
	    return arr;
	}
}

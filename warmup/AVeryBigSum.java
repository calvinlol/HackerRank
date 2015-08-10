package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AVeryBigSum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	//This is still useable, but have not use the array.
/*    	Scanner in = new Scanner(System.in);
    	int n;
    	long sum = 0;
    	long num;
    	n = in.nextInt();
    	for(int i = 0; i < n; i++){
    		num = in.nextLong();
    		sum += num;
    	}
        System.out.println(sum);    */	
    	
    	
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	long arr[] = new long[n];
    	for(int i = 0; i < n; i++){
    		arr[i] = in.nextLong();
    	}
    	long sum = 0;
    	for(int i = 0; i < n; i++){
    		sum += arr[i];
    	}
    	System.out.println(sum);
    	
    }
}

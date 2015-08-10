package warmup;

import java.util.Scanner;
public class DiagonalDifference {
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int arr[] = new int[n];
		int sum = 0, diaSum = 0;
		for(int i=0; i <n; i++){
			for(int l = 0; l<n; l++){
				arr[l] = cin.nextInt();
			}
			sum += arr[i];
			diaSum += arr[n-i-1];
		}
		int result = Math.abs(sum-diaSum);
		System.out.println(result);
		
	}
}

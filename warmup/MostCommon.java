package warmup;

import java.util.*;

public class MostCommon {
	public static void main (String[] args){
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		//int[] a = {5, 4, 3, 2, 4, 5, 1, 6, 1, 2, 5, 4};
		//int[] a = {1, 2, 3, 4, 5, 1, 6, 7};
		ArrayList<Integer> all = findMostCommon(a);
		System.out.println(all);
	}
	
	public static ArrayList<Integer> findMostCommon(int[] arr){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Arrays.sort(arr);
		int count = 1, maxCount = 1;
		al.add(arr[0]);
		for(int i = 1; i < arr.length; i++){
			if(arr[i]==arr[i-1]){
				count++;
				if(count > maxCount){
					al.clear();
					al.add(arr[i-1]);
					maxCount++;
				}else if(count == maxCount){
					al.add(arr[i-1]);
				}
			}else{
				count=1;
				if(maxCount==1){
					al.add(arr[i]);
				}
			}
		}
		return al;
		
	}
}

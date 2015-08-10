package warmup;

import java.util.*;

public class PositiveDivisors {
	public static void main(String[] args){
		try{
			Scanner cin = new Scanner(System.in);
			int num = cin.nextInt();	
			if(num<=0){
				System.out.println("Please input a positive integer"); 
			}else{
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i =1; i<num; i++){
				if(num%i == 0) al.add(i);
			}
			System.out.println("The positive divisors are " + al);
			}
		}catch(Exception e){
			System.out.println("Please input an integer"); 
		}
	}
}

package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int arrLength = cin.nextInt();
		String arr[] = new String[arrLength];
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < arrLength; i++){
			for(int l = 0; l < arrLength; l++){
				if(l<=(arrLength - i-2)){
					sb.append(" ");
				}else{
					sb.append("#");
				}
			}
			System.out.println(sb);
			sb.setLength(0);
		}
	}
}

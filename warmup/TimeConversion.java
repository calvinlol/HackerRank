package warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		String time = cin.nextLine();
		int h = Integer.parseInt(time.substring(0, 2));
		if(time.charAt(8)=='A'){
			if(h==12){
				time = "00" + time.substring(2, 8);
			}else{
			time = time.substring(0, 8);
			}

		}else{
			if(h!=12) h += 12;
			time = Integer.toString(h) + time.substring(2, 8);
		}
		System.out.println(time);
	}
}

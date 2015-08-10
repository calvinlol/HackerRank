package warmup;

import java.util.*;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int act[] = new int[3];
		int exp[] = new int[3];
		int fine = 0;
		for (int i = 0; i < 3; i++) {
			act[i] = cin.nextInt();
		}
		for (int j = 0; j < 3; j++) {
			exp[j] = cin.nextInt();
		}
		if(act[2] != exp[2]){
			if(act[2] > exp[2])	fine = 10000* (act[2] - exp[2]);
		}else if(act[1] != exp[1]){
			if(act[1] > exp[1]) fine = 500 * (act[1] - exp[1]);
		}else if(act[0] != exp[0]){
			if(act[0] > exp[0]) fine = 15 * (act[0] - exp[0]);
		}

// This is my first solution.
/*		if (act[2] > exp[2]) {
			fine = 10000 * (act[2] - exp[2]);
		} else if (act[2] == exp[2]) {
			if (act[1] > exp[1]) {
				fine = 500 * (act[1] - exp[1]);
			} else if (act[1] == exp[1]) {
				if (act[0] > exp[0]) {
					fine = 15 * (act[0] - exp[0]);
				} else {
					fine = 0;
				}
			} else {
				fine = 0;
			}
		} else {
			fine = 0;
		}*/
		System.out.println(fine);
	}
}

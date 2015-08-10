package warmup;

import java.math.*;
import java.util.*;

public class ExtraLongFactorials {
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		//BigInteger n = cin.nextBigInteger();
		BigInteger reallyBig = new BigInteger("1");
		for(int i =1; i <=n; i++){
			reallyBig = reallyBig.multiply(BigInteger.valueOf(i));
		}
		System.out.println(reallyBig);
	}
}

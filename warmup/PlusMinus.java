package warmup;
import java.text.DecimalFormat;
import java.util.*;
public class PlusMinus {
	private static DecimalFormat df3 = new DecimalFormat("#.###");
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int n = 0;
		n = cin.nextInt();
		int numOfPlus=0, numOfMinus = 0, numOfZero = 0;
		for(int i = 0; i < n; i++){
			int num = cin.nextInt();
			if(num > 0){
				numOfPlus++;
			}else if(num<0){
				numOfMinus++;
			}else{
				numOfZero++;
			}
		}

			double perOfPlus = (double)numOfPlus/(double)n;
			double perOfMinus = (double)numOfMinus/(double)n; 
			double perOfZero = (double)numOfZero/(double)n;
			

			
			System.out.println(df3.format(perOfPlus));
			System.out.println(df3.format(perOfMinus));
			System.out.println(df3.format(perOfZero));
	}

}

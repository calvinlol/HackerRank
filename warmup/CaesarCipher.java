package warmup;

import java.util.*;

public class CaesarCipher {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		StringBuilder sb = new StringBuilder();
		String str = cin.next();
		int k = cin.nextInt();
		for(int i=0; i < n; i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				if(ch >= 'a' && ch <= 'z'){
					while((char)(ch+k) > 'z'){
						ch -= 26;
					}
				}else{
					while((char)(ch+k) > 'Z'){
						ch -= 26;
					}
				}
				sb.append((char)(ch+k));
			}else{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}

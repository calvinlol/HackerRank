package warmup;
import java.util.*;
public class ValidTriangle {
	public static void main(String[] args) throws InvalidTriangleException{
			Scanner cin = new Scanner(System.in);
			ArrayList<Double> al = new ArrayList<Double>();			
			while(cin.hasNext()){
				if(!cin.hasNextDouble()) throw new InvalidTriangleException();
				al.add(cin.nextDouble());
				if(al.size() == 3)break;
			}
			for(int i = 0; i < 3; i++){
				if(al.get(i)<=0) throw new InvalidTriangleException();
			}
			System.out.println(triangleArea(al.get(0), al.get(1), al.get(2)));		
	}
	
	public static double triangleArea(double a, double b, double c) throws InvalidTriangleException{	
		double hp = (a+b+c)/2;
		double area = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
		if (a + b < c || a + c < b || b + c < a) throw new InvalidTriangleException();
		return area;
	}
}

class InvalidTriangleException extends Exception{

}

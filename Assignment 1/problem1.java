package mastek_assesment;
import java.util.Scanner;
import java.math.*;
public class problem1 {

	public static void main(String[] args) {
		int number1,number2;
		Scanner s = new Scanner(System.in);
		number1=s.nextInt();
		number2=s.nextInt();
		int result=(int) Math.pow(number1,2)+(int)Math.pow(number2,2);  //sum of number1,number2 squares//
		if(result>100)
		{
			System.out.print(number1+" "+number2);
		}
		else
			System.out.println(result);
	}

}

package mastek_assesment;
import java.util.Scanner;

public class problem8 {

	public static void main(String[] args) {
		int i,number;
		long sum=0;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		for(i=1;i<=number;i++)
		{
			sum = sum + (int)Math.pow(i,i+1);
		}
		System.out.println("the sum of required series is"+sum);
	}

}

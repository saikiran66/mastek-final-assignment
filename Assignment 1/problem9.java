package mastek_assesment;
import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {
		int input[]=new int[10];
		int i,sum=0;
		long product=1;
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			input[i]=s.nextInt();
			sum = sum+input[i];
			product = product*input[i];
		}
		System.out.println("the sum of n numbers is"+sum);
		System.out.println("the product of n numbers is"+product);
	}

}

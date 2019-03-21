package mastek_assesment;
import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		int i,number,sum=0;
		long product=1;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		for(i=1;i<=number;i++)
		{
			sum=sum+i;
			product=product*i;
		}
		System.out.println("the sum of n numbers is"+sum);
		System.out.println("the product of n numbers is"+product);
	}

}

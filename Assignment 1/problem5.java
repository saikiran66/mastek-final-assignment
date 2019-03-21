package mastek_assesment;
import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		int i,number,count=0;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		for(i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
				count++;
		}
		if(count==0)
			System.out.println("prime number");
		else
			System.out.println("not prime number");

	}

}

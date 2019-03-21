package mastek_assesment;
import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
		int i,number;
		long factorial=1;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The factorial of the number"+number+" is"+factorial);

	}

}

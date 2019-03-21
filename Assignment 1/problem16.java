package mastek_assesment;
import java.util.Scanner;

public class problem16 {

	public static void main(String[] args) {
		// smallest number in given array of length 100
		int array[] = new int[100];
		int i,minimum_value=99999;
		Scanner s = new Scanner(System.in);
		for(i=0;i<100;i++)
		{
			array[i]=s.nextInt();
			if(array[i]<minimum_value)
			{
				minimum_value = array[i];
			}
		}
		System.out.println("The smallest of the given array of numbers is "+minimum_value);

	}

}

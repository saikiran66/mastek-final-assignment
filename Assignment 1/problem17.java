package mastek_assesment;
import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		//largest of 100 positive numbers
		int array[] = new int[100];
		int i,maximum_value=0;
		Scanner s = new Scanner(System.in);
		for(i=0;i<100;i++)
		{
			array[i]=s.nextInt();
			if(array[i]>maximum_value)
			{
				maximum_value = array[i];
			}
		}
		System.out.println("The largest of the given array of numbers is "+maximum_value);

	}

}

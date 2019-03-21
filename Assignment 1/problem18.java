package mastek_assesment;
import java.util.Scanner;

public class problem18 {

	public static void main(String[] args) {
		int array[] = new int[100];
		int i,maximum_value=0,minimum_value=99999;
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			array[i]=s.nextInt();
			if(array[i]>maximum_value)
			{
				maximum_value = array[i];
			}
			if(ar[i]<minimum_value)
			{
				minimum_value = array[i];
			}
		}
		int range = maximum_value-minimum_value;
		System.out.println("The largest of the given array of numbers is "+maximum_value);
		System.out.println("The smallest of the given array of numbers is "+minimum_value);
		System.out.println("The range of the given array of numbers is "+range);
	}

}

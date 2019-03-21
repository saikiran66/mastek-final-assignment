package mastek_assesment;
import java.util.Scanner;

public class problem13 {

	public static void main(String[] args) {
		int i,pass_count=0,failure_count=0;
		Scanner s = new Scanner(System.in);
		int array[]=new int[100];
		for(i=0;i<100;i++){
			array[i]=s.nextInt();
			if(array[i]>35)
				pass_count++;
			else
				failure_count++;
				}
		System.out.println("number of students passed"+pass_count);
		System.out.println("number of students failed"+failure_count);

	}

}

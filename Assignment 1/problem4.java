package mastek_assesment;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		int i=0;
		double piece_rate_of_item1=1.20,piece_rate_of_item2=1.80,piece_rate_of_item3=2.25;
		double salary[] = new double[100];
		int u1[] = new int[100];
		int u2[] = new int[100];
		int u3[] = new int[100];
		int employee[] = new int[100];
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(true)
		{
			
			employee[i]=s.nextInt();
			if(employee[i]==0)
				break;
			u1[i] = s.nextInt();
			u2[i] = s.nextInt();
			u3[i] = s.nextInt();
			salary[i] = u1[i]*piece_rate_of_item1+u2[i]*piece_rate_of_item2+u3[i]*piece_rate_of_item3;
			i++;
		}
		for(int j=0;j<i;j++)
		{
			System.out.println("Employee id"+employee[j]+"\t gross salary"+salary[i]);
		}
	}

}

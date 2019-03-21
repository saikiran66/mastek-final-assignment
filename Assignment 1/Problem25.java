package mastek_assesment;
import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		int Account_number[]=new int[100];
		int years[]=new int[100];
		String Account_name[]=new String[100];
		double amount[]=new double[100];
		double total[]=new double[100];
		int i;
		Scanner s = new Scanner(System.in);
		for(i=0;i<100;i++)         // 
		{
			Account_number[i]=s.nextInt();
			years[i]=s.nextInt();
			Account_name[i]=s.next();
			amount[i]=s.nextDouble();
			if(amount[i]>5000&&years[i]>3)
				total[i]=total[i]+total[i]*0.12;
			if(amount[i]>5000&&years[i]<=3)
				total[i]=total[i]+total[i]*0.10;
			if(amount[i]<=5000&&years[i]<3)
				total[i]=total[i]+total[i]*0.09;	
		}
		System.out.println("AccountNumber      Account_name      amount     total    ");
		for(i=0;i<100;i++)
		{
			System.out.println(Account_number[i]+"    "+Account_name[i]+"    "+amount[i]+"   "+total[i]);
		}
		

	}

}

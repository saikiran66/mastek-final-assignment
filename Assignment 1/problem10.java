package mastek_assesment;
import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
		int cust_no[] = new int[200];
		int prod_no[]=new int[200];
		int qty[] = new int [200];
		int rate[]= new int[200];
		int price[] = new int[200];
		int total=0;
		int i;
		Scanner s = new Scanner(System.in);
				for(i=0;i<200;i++)
				{
					cust_no[i] = s.nextInt();
					prod_no[i]=s.nextInt();
					qty[i]=s.nextInt();
					rate[i] = s.nextInt();
					price[i]=s.nextInt();
					total = total+price[i];
				}
				System.out.println("cust_no		prod_no	   qty   rate    price");
				for(i=0;i<200;i++)
				{
					System.out.println(cust_no[i]+"		"+prod_no[i]+"	 "+qty[i]+"   "+rate[i]+"    "+price[i]);
					
				}
				System.out.println("\n\n Total sales is :"+total);
	}
}



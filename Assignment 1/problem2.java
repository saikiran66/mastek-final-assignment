package mastek_assesment;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		int order_A,order_B;
		float discount_A=0,discount_B=0;
		Scanner s = new Scanner(System.in);
		order_A=s.nextInt();
		order_B=s.nextInt();
		if(order_A>5000)
		{
			discount_A = (5*order_A)/100; //calculating dicount of order A//
		}
		if(order_B>10000)
		{
			discount_B = (7*order_B)/100; //calculating dicount of order B//
		}
		System.out.println("discount on product A is "+discount_A+" and discount on product B is "+discount_B);

	}

}

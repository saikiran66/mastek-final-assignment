package mastek_assesment;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		int sales;
		double commission = 0;//commission
		Scanner s = new Scanner(System.in);
		sales = s.nextInt();
		int value=0;
		if(sales>100000)
		{
			value =sales-100000;
			commission = val*0.1;
		}
		if(sales-value>70000){
			value=sales-value-30000;
			commission = com+value*0.75;
		}
		if(sales-value>50000)
		{
			value = sales-value-20000;
			commission=commission+value*0.5;
		}
			if(sales-value>30000)
			{
				value = sales-value-20000;
				commission = commission+value*.25;
			}
			else
			if(sales<30000)
			{
				sales= sales-10000;
				commission = commission+sales*.25;
			}
		
		
		System.out.println("The payable commision is "+commission);

	}

}

package mastek_assesment;
import java.util.Scanner;

public class problem23 {

	public static void main(String[] args) {
		double basic,gross;
		double gross_inc,income_tax=0;
		double personal_tax,da=0;
		Scanner s = new Scanner(System.in);
		basic = s.nextDouble();
		if(basic<1000)
		{
			da = basic*0.6;
		}
		else
		{
			da = da+1000*0.6;
			if(basic<2000)
				da+=1000*0.5;
			else
			{
				da+=1000*0.5;
				da+= basic-2000*0.4; 
			}
		}
		gross = da+basic;
		if(gross<300)
			gross=300;
		else
			if(gross>1500)
			{
				gross=1500;
			}
		//Calculate personal tax 
		if(gross<800)
		{
			personal_tax = 0;
		}
		if(gross>=800&&gross<1200)
		{
			personal_tax = 15;
		}
		else
			personal_tax = 20;
		gross_inc = gross*12;//gross income
		// calculate income tax
		if(gross_inc<1800)
		{
			income_tax = 0;
		}
		if(gross_inc>=18000&&gross<25000)
		{
			income_taxt = 0.25*gross_inc;
		}
		if(gross_inc>=25000&&gross<50000)
		{
			income_tax = 1750+0.30*gross_inc;
		}
		if(gross_inc>=5000&&gross<100000)
		{
			income_tax = 9250+0.40*gross_inc;
		}
		if(gross_inc>100000)
		{
			income_tax = 29250+0.50*gross_inc;
		}
		
		//calculate net payble salary
		double net_sal = (basic+da)*12 -income_tax-personal_tax;
		System.out.println("Net payble salary is per year:"+net_sal);

	}

}

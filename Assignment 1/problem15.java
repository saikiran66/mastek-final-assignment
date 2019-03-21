package mastek_assesment;
import java.util.Scanner;
public class problem15 {

	public static void main(String[] args) {
		double population_of_country_A = 6000000,population_of_country_B = 9000000;
		double population_growth_of_country_A = 0.058,population_growth_of_country_B = 0.042;
		int years=0;
		while(population_of_country_A<population_of_country_B)
		{
			population_of_country_A = population_of_country_A+population_of_country_A*population_growth_of_country_A;
			population_of_country_B = population_of_country_B+population_of_country_B*population_growth_of_country_B;
			years++;
		}
		System.out.println("The number of years to A population exceeds the B population :"+years);
	}

}

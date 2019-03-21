package mastek_assesment;
import java.util.Scanner;

public class problem14 {

	public static void main(String[] args) {
		int marks[] = new int[100];
		int i,n,first_class=0,pass_class=0,second_class=0,fail=0;
		double first_class_percentage,pass_class_percentage,second_class_percentage,fail_percentage;// first class, pass class ,second class and fail percentages
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		for(i=0;i<n;i++)
		{
			marks[i] = s.nextInt();
			if(marks[i]<35)
				fail++;
			if(marks[i]>=35&&marks[i]<45)
				pass_class++;
			if(marks[i]>=45&&marks[i]<60)
				second_class++;
			if(marks[i]>=60)
				first_class++;
		
		}
		first_class_percentage = first_class/n *100;
		second_class_percentage = second_class/n *100;
		pass_class_percentage = pass_class/n *100;
		fail_percentage = fail/n *100;
		
		System.out.println("The number of students getting First class:"+first_class+"and percentage "+first_class_percentage);
		System.out.println("The number of students getting second class:"+second_class+"and percentage "+second_class_percentage);
		System.out.println("The number of students getting pass class:"+pass_class+"and percentage "+pass_class_percentage);
		System.out.println("The number of students getting failed:"+fail+"and percentage "+fail_percentage);
	
	}

}


+import java.util.Scanner;
import java.lang.String.*;
public class problem21 {

	public static void main(String[] args) {
		int male_droupouts=0,female_droupouts=0;
		boolean dr[]=new boolean[100];
		//if boolean is true the student drop out otherwise continued
		String gender[]=new String[100];
		int i;
		Scanner s = new Scanner(System.in);
		for(i=0;i<100;i++)//Survey  taken from 100 members
		{
			gender[i] =s.nextLine();
			dr[i] = s.nextBoolean();
			if(gender[i].equalsIgnoreCase("male")&&dr[i]==true)
			{
				male_droupouts++;
			}
			if(gender[i].equalsIgnoreCase("female")&&dr[i]==true)
			{
				female_droupouts++;
			}
				
		}
		System.out.println("The percentage of female dropouts "+female_droupouts+"\n The percentage of male dropouts:"+male_droupouts);
		

	}

}

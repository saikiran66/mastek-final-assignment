package mastek_assesment;
import java.util.Scanner;

public class problem11 {

	public static void main(String[] args) {
		int count=0;
                float totalsalary=0;
                float incrementalsalary=0;
Scanner kb=new Scanner(System.in);
String[] st=new String[10];
int[] time=new int[10];
float[] salary=new float[10];
float[] bf=new float[10];
for(int i=0;i<10;i++)
{
st[i]=kb.next();
time[i]=kb.nextInt();
salary[i]=(float)(time[i]*4.50);
totalsalary=totalsalary+salary[i];
if(salary[i]>=720)
{
  bf[i]=(float)(salary[i]*0.05);
}
else
{
  bf[i]=0;
}
if(bf[i]>0)
{
  count++;
}
incrementalsalary=incrementalsalary+bf[i];
}
for(int i=0;i<10;i++)
{
System.out.println(st[i]+""+time[i]+""+salary[i]+""+bf[i]);
}
System.out.println("Total salary: "+totalsalary);
System.out.println("incremental salary: "+tbf);
System.out.println("incremental value count: "+count);
}
}

	}

}

package mastek_assesment;
import java.util.Scanner;

public class problem19 {

	public static void main(String[] args) {
		int sno;//sales men id
		int sr;//sales in rs
		int max,maxid,min,minid;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter salesmen id and sales in rupes");
		sno=s.nextInt();//initial salesmen id
		sr=s.nextInt();//initial sales  in rupees
		max = min = sr;
		maxid = minid = sno;
		while(true)
		{
			
			sno=s.nextInt();
			sr = s.nextInt();
			if(sno==0)
			{
				break;
			}
			if(sr<min)
			{
				min = sr;
				minid=sno;
			}
			if(sr>max)
			{
				max=sr;
				maxid=sno;
			}
		}
		System.out.println("The highest weakly sales"+max+" the salesmen id :"+maxid);
		System.out.println("The lowest weakly sales"+min+" the salesmen id :"+minid);
	}

}

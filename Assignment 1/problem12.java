

public class problem12 {

	public static void main(String[] args) {
		int i,number,positive_values=0,zero_values=0,negative_values=0;
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		int array[]=new int[number];
		for(i=0;i<number;i++){
			array[i]=s.nextInt();
			if(array[i]>0)
				positive_values++;
			else
				if(array[i]<0){
					negative_values++;
				}
				else
					zero_values++;
		}
		System.out.println("number of positive numbers"+positive_values);
		System.out.println("number of negitive numbers"+negative_values);
		System.out.println("number of zero numbers"+zero_values);
	}

}

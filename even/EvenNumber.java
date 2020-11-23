package even;
import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		int a, i,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any no:");
		a = obj.nextInt();
		i=1;
		do {
			if(i%2==0)
			{
			sum=sum+i;	
			}
			i++;
		}
	while(i<=a);
		System.out.println("\n The sum of even no "+a+ "=" +sum);
	}
	

}

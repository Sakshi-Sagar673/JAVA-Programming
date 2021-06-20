import java.util.*;
public class DectoBinary{
	public static void main(String args[])
	{
		int num,i,rem,binary=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		i=1;
		while(num!=0)
		{
			rem = num % 2;
			binary = binary + (rem*i);
			num = num / 2;
			i=i*10;
		}
		System.out.println("Binary equivalent=" +binary);
	}
}
			
		

import java.util.*;
public class BinarytoDec{
	public static void main(String args[])
	{
		int num,i,rem,decimal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		i=1;
		while(num!=0)
			{
			rem = num % 10;
			decimal = decimal + (rem*i);
			num = num / 10;
			i=i*2;
			}
		System.out.println("Decimal equivalent=" +decimal);
	}
}

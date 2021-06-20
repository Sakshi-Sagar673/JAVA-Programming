import java.util.*;
public class BinarytoOctal{
	public static void main(String args[])
	{
		int num,j,dec,remainder,octal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		j=1;
		while(num!=0)
		{
			remainder = num % 1000;
			dec = bintodec(remainder);
			octal = octal + dec * j;
			j = j * 10;
			num = num / 1000;
		}
		System.out.println("Octal equivalent="+octal);	
		
	}
	public static int bintodec(int n)
	{
		int i=1,rem,decimal=0;
		while(n!=0)
			{
			rem = n % 10;
			decimal = decimal + (rem*i);
			n = n / 10;
			i=i*2;
			}
			return decimal;
	}
}

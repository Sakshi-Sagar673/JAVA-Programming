import java.util.*;
public class Gcd
{
	public static void main(String args[])
	{
		int num1,num2,i,gcd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//calculating gcd
		
		for(i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD="+gcd);
	}
}

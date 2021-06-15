import java.util.Scanner;
public class PrimeNo
{
	public static void main(String args[])
	{
		int num,i,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		if(num==0 || num==1)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
		}
	}
}
		
			
		

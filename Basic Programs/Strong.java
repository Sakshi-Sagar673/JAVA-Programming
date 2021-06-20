import java.util.*;
public class Strong{
	public static void main(String args[])
	{
		int num,i,d,f,origno,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		origno=num;
		while(num!=0)
		{
			d=num%10;
			f=factorial(d);
			sum=sum+f;
			num=num/10;
		}
    //check strong number or not
		if(sum==origno)
		{
			System.out.println(origno+" is a strong number.");
		}
		else
		{
			System.out.println(origno+" is not a strong number.");
		}
	}

		
		
		//Calculate factorial
		public static int factorial(int n)
		{
			int fact=1;
			for(int j=1;j<=n;j++)
			{
				fact=fact*j;
			}
			return fact;
		}
}

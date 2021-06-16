import java.util.Scanner;
public class PrimeBetweenTwoNos
{
	public static void main(String args[])
	{
		int num1,num2,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		System.out.println("Prime numbers between "+num1+" and "+num2+":");
		for(j=num1;j<=num2;j++)
		{
			if(isPrime(j))
			{
				System.out.print(j+" ");
			}
			else
			{
		
			}
		}
 }

public static boolean isPrime(int num)
{
	int i;
	if (num <= 1)
		{  
        return false;  
    } 
    else{
        for (i = 2; i <= Math.sqrt(num); i++) 
        {  
           if (num % i == 0)
           {
               return false;  
           }  
       } 
	}	   
       return true;  
}
}

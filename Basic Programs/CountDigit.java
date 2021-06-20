import java.util.*;
public class CountDigit{
	public static void main(String args[])
	{
		int num,i,rem,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = sc.nextInt();
		
		while(num!=0)
		{
		   rem=num%10;
		   count++;
		   num=num/10;
		}
		System.out.println("No of digits in given number is:"+count);
	}
}
		


import java.util.*; 
public class Palindrome
{
	public static void main(String args[])
	{
		int num,origNo,rem,revNo=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		origNo=num;
		while(num!=0)
		{
			rem = num%10;
			revNo = revNo*10 + rem;
			num = num/10;
		}
			if(revNo==origNo)
			{
				System.out.println(origNo+" is a palindrome number");
			}
			else
			{
				System.out.println(origNo+" is not a palindrome number");
			}
	}
}
		

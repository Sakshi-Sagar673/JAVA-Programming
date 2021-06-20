import java.util.*;
public class Lcm
{
	public static void main(String args[])
	{
		int num1,num2,low,lcm=0,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//finding smaller number
		low = (num1<num2)?num1:num2;
		
		//calculating lcm
		while(i!=0)
		{
			if(low%num1==0 && low%num2==0)
			{
				lcm=low;
				break;
			}
			low++;
		}
		
		System.out.println("LCM="+lcm);
	}
}

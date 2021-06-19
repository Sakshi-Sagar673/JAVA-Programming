import java.util.*;
public class PerfectsqCheck
{
	public static void main(String args[])
	{
		double num,root,fvalue,diff;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		root= Math.sqrt(num);
		fvalue= Math.floor(root);
		diff= root - fvalue;
		
		if(diff==0)
		{
			System.out.println(num+" is a perfect square.");
		}
		else
		{
			System.out.println(num+" is not a perfect square.");
		}
	}
}

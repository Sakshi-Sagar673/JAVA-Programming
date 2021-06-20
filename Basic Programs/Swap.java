import java.util.*;
public class Swap{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		num2 = sc.nextInt();
		
		//swap using two variables
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("1st number="+num1+" and 2nd number="+num2);
	}
}

import java.util.*;
public class CountChar{
	public static void main(String args[])
	{
		int i;
		String str;
		int freq[]=new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		str = sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			freq[(int)str.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
			if(freq[i]!=0)
			{
				System.out.println((char)i+" - "+freq[i]);
			}
		}
	}
}
		
		

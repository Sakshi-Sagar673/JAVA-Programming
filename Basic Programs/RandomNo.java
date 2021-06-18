import java.util.*;  
public class RandomNo  
{  
public static void main( String args[] )   
{  
int min, max;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number:");
min=sc.nextInt();
System.out.println("Enter 2nd number:");
max=sc.nextInt();
//Generate random double value  
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
double a = Math.random()*(max-min+1)+min;   
System.out.println(a);  
//Generate random int value  
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
}  

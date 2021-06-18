import java.util.*;  
class Armstrong{
	public static void main(String args[]){  
     int num,originalNo,rem, result=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number:");
     num=sc.nextInt();
	   originalNo = num;

        while (originalNo != 0)
        {
            rem = originalNo % 10;
            result = result + (rem*rem*rem);
            originalNo = originalNo / 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}
}

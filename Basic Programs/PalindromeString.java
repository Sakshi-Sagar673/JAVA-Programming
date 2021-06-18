
import java.util.*;
public class PalindromeString{
 
    // Function that returns true if
    // str is a palindrome
    static boolean isPalindrome(String str)
    {
 
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String origNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		origNo = sc.nextLine();  
 
        if (isPalindrome(origNo))
            System.out.print(origNo+" is a palindrome string.");
        else
            System.out.print(origNo+" is not a palindrome string.");
    }
}

import java.util.*;
//Check if string is palindrome
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		str = str.toLowerCase();
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)){
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not Palindrome");
		}
	}
}

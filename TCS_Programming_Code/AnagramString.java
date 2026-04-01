import java.util.*;
//Check if two strings are anagrams
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine().trim();
		
		String str2 = sc.nextLine().trim();
		
		if(str1.length() != str2.length()){
		    System.out.println("false");
		    return;
		}
		 String arr1 [] = new String[str1.length()];
		 String arr2 [] = new String[str2.length()];
		for(int i =0;i< str1.length();i++){
		    String ch1 = str1.charAt(i)+"";
		    
		    String ch2 = str2.charAt(i)+"";
		    
		    arr1[i] = ch1;
		    arr2[i] = ch2;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)){
		    System.out.println("true");
		}else{
		    System.out.println("false");
		}
		
	}
}

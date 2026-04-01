import java.util.*;
//Find missing number in sequence (1 to N)
public class Main
{
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,8};
		
		int n = arr.length;
		int max = 0, sum = 0;
		for(int i = 0;i<n;i++){
		    sum+= arr[i];
		    max = Math.max(arr[i],max);
		}
		int total = max*(max+1)/2;
		
		System.out.println(total-sum);
	}
}

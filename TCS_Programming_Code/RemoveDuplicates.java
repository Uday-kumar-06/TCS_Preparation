import java.util.*;
//Remove duplicates from array
public class Main
{
	public static void main(String[] args) {
		int arr [] = {1,3,3,4,5,5,8};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i =0;i<arr.length;i++){
		    set.add(arr[i]);
		}
		
// 		set.forEach((x)-> System.out.print(x));
		int count = 0;
		for(Integer i : set){
		    count ++;
		    if(count == 1){
		        System.out.print(i);
		    }else{
		        System.out.print(" "+i);
		    }
		}
	}
}

import java.util.*;
//Find element that appears odd number of times
public class Main
{
	public static void main(String[] args) {
		int arr [] = {1,3,3,4,5,5,8,5};
		
		List<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<arr.length; i++){
		    if(map.containsKey(arr[i])){
		        map.put(arr[i],map.get(arr[i])+1);
		    }else{
		        map.put(arr[i],1);
		    }
		}
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
		    if(entry.getValue()%2 != 0 && entry.getValue() > 1){
		        list.add(entry.getKey());
		    }
		}
		
		System.out.println(list);
	}

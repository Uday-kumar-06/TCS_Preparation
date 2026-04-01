import java.util.*;
//Count subsets with given sum
public class Main
{
    public static int count = 0;
    public static void subSet(int index, int arr [],List<Integer> list, List<List<Integer>> list1){
        if(index == arr.length){
            int sum = 0;
            for(int num: list){
                sum += num;
            }
            if(sum == 4){
                list1.add(new ArrayList<>(list));
                count++;
            }
            return;
        }
        list.add(arr[index]);
        subSet(index+1,arr,list,list1);
        list.remove(list.size()-1);
        subSet(index+1,arr,list,list1);
    }
	public static void main(String[] args) {
		int arr [] = {1,3,3,4,5,5,8,5};
		
		List<List<Integer>> list1 = new ArrayList<>();
		
		subSet(0,arr,new ArrayList<>(),list1);
		
		System.out.println(list1);
		System.out.println(count);
	}
}

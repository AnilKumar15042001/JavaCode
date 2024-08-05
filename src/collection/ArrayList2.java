package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
//		Convert the Java List into Array
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer[] arr=new Integer[list.size()];
		list.toArray(arr);
		for(Integer n:arr)
		{
			System.out.println(n);
		}
		
//		Convert Java Array to List
		List list2=new ArrayList(Arrays.asList(arr));
		
		System.out.println(list2);
	}
}

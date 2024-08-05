package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
//		 Convert Map to List
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 1000);
		map.put(2, 2000);
		
		List list1=new ArrayList(map.keySet());
		List list2=new ArrayList(map.values());
		
		System.out.println(list1);
		System.out.println(list2);
				
	}
}

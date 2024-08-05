package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");
		
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue("TWO"));
		
		System.out.println(hm.size());
		
//		hm.clear();
//		
//		System.out.println(hm.size());
		
		Set<Integer> set=hm.keySet();
		
		for(Integer i:set)
		{
			System.out.println(i);
		}
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

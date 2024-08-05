package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap7 {

	public static void main(String[] args) {
		
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");
		
		System.out.println("Before HashMap:");
		
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("---------------------------");
		
//		hm.remove(3);
//		hm.remove(2, "ONE");
//		hm.remove(5, "FIVE");
		
		hm.replace(5, "55555");
		hm.replace(3, "THREE", "333");
		
		System.out.println("After HashMap:");
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}

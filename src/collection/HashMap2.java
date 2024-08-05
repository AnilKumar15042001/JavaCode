package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(1, "ONE");
		hm1.put(2, "TWO");
		hm1.put(3, "THREE");
		hm1.put(4, "FOUR");
		hm1.put(5, "FIVE");
		
		Set<Entry<Integer,String>>entry=hm1.entrySet();
		for(Entry<Integer,String> entrySet:entry)
		{
			System.out.println(entrySet.getKey()+":"+entrySet.getValue());
		}
		System.out.println("---------------------------");
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		
		hm2.put(6, "SIX");
		hm2.put(7, "Seven");
		hm2.put(8, "EIGHT");
		hm2.put(9, "NINE");
		hm2.put(10, "TEN");
		
		hm2.putAll(hm1);
		
		entry=hm2.entrySet();
		for(Entry<Integer,String> entrySet:entry)
		{
			System.out.println(entrySet.getKey()+":"+entrySet.getValue());
		}
	}
}

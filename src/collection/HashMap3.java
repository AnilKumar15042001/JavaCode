package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");
		
		hm.putIfAbsent(6, "SIX");
		hm.putIfAbsent(5, "FIVE");
		
		for(Map.Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}

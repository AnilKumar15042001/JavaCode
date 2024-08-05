package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap6 {

	public static void main(String[] args) {
		
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");

		System.out.println(hm.values());
		
		Collection<String> cl=hm.values();
		
		for(String str:cl)
		{
			System.out.println(str);
		}
		
		System.out.println("-------------------------");
		
		Iterator itr=cl.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

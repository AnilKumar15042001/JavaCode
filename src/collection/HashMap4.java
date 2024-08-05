package collection;

import java.util.HashMap;

public class HashMap4 {

	public static void main(String[] args) {
		
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ONE");
		hm.put(2, "TWO");
		hm.put(3, "THREE");
		hm.put(4, "FOUR");
		hm.put(5, "FIVE");
		
		String value=hm.get(5);
		System.out.println(value);
	}
}

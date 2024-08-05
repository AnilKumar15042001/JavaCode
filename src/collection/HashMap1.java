package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		
		HashMap<String,String> hm2=new HashMap<String,String>(30);
		
		HashMap<Integer,Integer> hm3=new HashMap<Integer,Integer>(50,0.75f);
		
		HashMap<String,Integer> hm4=new HashMap<String,Integer>(hm1);
		
		Map hm5=new HashMap();
		
		Map<String,Integer> hm6=new HashMap<String,Integer>();
		
		Map<String,Integer> hm7=new HashMap<>();
		
		HashMap hm8=new HashMap();
	}
}

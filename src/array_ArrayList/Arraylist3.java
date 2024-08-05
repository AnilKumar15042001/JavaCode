package array_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Arraylist3 {

	public static void main(String[] args) {
		
//		Object o[] = new Object[20];
//		ArrayList list=new ArrayList();
//		System.out.println("entter");
//		Scanner s=new Scanner(System.in);
//		
//		for(int i=0;i<10;i++)
//		{
//		  list.add(s.nextInt());
//		  list.add(s.next());
//		  System.out.println(list);
//		}
//		System.out.println(list.size());
		
		List<Map<String,String>> map=new ArrayList<>();
		
		Map<Set<Integer>,Set<String>> set=new HashMap<>();
		
		Set<Integer> set2=new HashSet<>();
		set2.add(101);
		
		Set<String> set3=new HashSet<>();
		set3.add("Sushil");
		
		set.put(set2, set3);
		
		for(Map.Entry entry:set.entrySet())
		{
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
				
		Map<String, String> data=new HashMap<>();
		data.put("1001", "Anil");
		data.put("1002", "Babu");
		map.add(0, data);
		
		map.add(1,data);
		
		System.out.println(map);
		
		Iterator<Map<String,String>> itr=map.iterator();
		while(itr.hasNext())
		{
			Map<String,String> map2=itr.next();
			
			for(Map.Entry<String, String> entry:map2.entrySet())
			{
				System.out.println(entry.getKey()+"--->"+entry.getValue());
			}
		}
	}
}

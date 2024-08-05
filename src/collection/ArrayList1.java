package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
//		Join two lists
		
		List list1=new ArrayList();
		list1.add("Anil");
		
		List list2=new ArrayList();
		list2.add("Babu");
		
		List join=new ArrayList();
		
		join.addAll(list1);
		join.addAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(join);
	}
}

package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetToArrayAndViceVersa {

	
	public static void main(String[] args) {
		//Set to Array
		Set<String> set=new HashSet<>();
		set.add("Anil");
		set.add("Babu");
		System.out.println(set);
		
		String[] arr=new String[set.size()];
		set.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		//Array to Set
		Set set2=new HashSet(Arrays.asList(arr));
		System.out.println(set2);
		
	}
}

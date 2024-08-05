package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
	
	
	static String[] m(String...value)
	{
		return value;
	}

	public static void main(String[] args) {
		
//		char ch[]= {'a','b','c'};//character sequence
//		String s=new String(ch);//coverted into as String
//		System.out.println(s);
//		
//		String s1=new String("Anil");
//		String s2=new String("Babu");
//		String s3=new String("Anil");
//		
//		
////		immutable concept
//		
//		String s4=new String("Anil");
//		s4.concat(s2);
//		System.out.println(s4);
//		
////		mutable
//		StringBuffer sb=new StringBuffer("Anil");
//		sb.append(s2);
//		System.out.println(sb);
//		
//		String s5="Anil";
//		
//		
////		Difference between "==" and "equals()"
//		
//		System.out.println(s1==s3);//false
//		System.out.println(s1.equals(s3));//true
//		System.out.println(s1==s5);//false
//		System.out.println(s1.equals(s5));//true
		
		for(String str:m("Anil","Babu","Sunil"))
		{
			System.out.println(str);
		}
		
		List list=new ArrayList<>(Arrays.asList(m("Anil","babu")));
		
		System.out.println(list);
		
		
	}
}

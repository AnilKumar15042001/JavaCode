package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SubstringWithConcatenationOfAllWords {

	public List<Integer> findSubstring(String s, String[] words)
	{
		String str="";
		List list=new ArrayList(Arrays.asList(words));
		List<Integer> list2=new ArrayList<Integer>();
//		for(int i=0;i<words.length;i++)
//		{
//			for(int j=i+1;j<words.length;j++)
//			{
//				str=words[i]+words[j];
//				list2.add(s.indexOf(str));
//			}
//		}
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			String string=itr.next()+itr.next()+itr.next();
			String string2=itr.previous()+itr.previous()+itr.previous();
			System.out.println(string+" "+string2);
			break;
		}
		System.out.println(list);
		list2.add(s.indexOf("foobarthe"));
		return list2;
	}
	
	public static void main(String[] args) {
		
		SubstringWithConcatenationOfAllWords obj=new SubstringWithConcatenationOfAllWords();
		System.out.println(obj.findSubstring("barfoothefoobarman", new String[]{"foo","bar","the"}));
	}
}

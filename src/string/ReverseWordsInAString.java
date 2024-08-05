package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInAString {

	public String reverseWords(String s) {

		String[] str=s.split(" ");
		String rev="";
		List<String> list=new ArrayList<String>();
		for(int i=str.length-1;i>=0;i--)
		{
			list.add(str[i]);
		}
		String[] arr=new String[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			rev=rev.trim();
			rev=rev+" "+arr[i];
			rev=rev.trim();
		}
		return rev;
	}
	public static void main(String[] args) {
		
		ReverseWordsInAString obj=new ReverseWordsInAString();
		System.out.println(obj.reverseWords("the sky is blue"));
	}
}

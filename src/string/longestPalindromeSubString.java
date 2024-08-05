package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestPalindromeSubString {
//babad
	public List<String> longestPalindrome(String str)
	{
		List<String> list=new ArrayList<String>();
		String originalString="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				list.add(str.substring(i, j));
				
			}
		}
		System.out.println(list);
		List<String> list2=new ArrayList<String>();
		for(String string:list)
		{
			String rev="";
			if(string.length()>=2)
			{
				originalString=string;
				for(int i=string.length()-1;i>=0;i--)
				{
					rev=rev+string.charAt(i);
				}
				if(originalString.equals(rev))
				{
					list2.add(rev);
					System.out.println(rev+" is pallindrome");
				}
				else
				{
					System.out.println(rev+" is not pallindrome");
				}
			}
		}
		return list2;
	}
	public static void main(String[] args) {
		
		longestPalindromeSubString obj=new longestPalindromeSubString();
		List<String> list3=obj.longestPalindrome("cbbd");
		System.out.println(list3);
	}
}

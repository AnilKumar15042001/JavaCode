package string;

import java.util.regex.Pattern;

public class ValidPalindrome {

	String originalString="";
	public boolean isPalindrome(String s) {

		s=s.toLowerCase();
		s=s.replaceAll("_", "");
		String rev="";
		if(s.isEmpty())
		{
			return true;
		}
		String[] str=s.split("\\W+");
		for(String str2:str)
		{
			originalString=originalString+str2;
		}
		char[] ch=originalString.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		if(originalString.equals(rev))
		{
			System.out.println(rev+" is pallindrome");
			return true;
		}
		else
		{
			System.out.println(rev+" is not pallindrome");
			return false;
		}
		
//		return true;
	}
	public static void main(String[] args) {
		
		ValidPalindrome obj=new ValidPalindrome();
		System.out.println(obj.isPalindrome("ab_a"));
	}
}

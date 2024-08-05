package string;

import java.util.Arrays;

public class LongestCommonPrefixUsingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestCommonPrefixUsingSorting obj=new LongestCommonPrefixUsingSorting();
//		String prefix=obj.commonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"});
		String prefix=obj.commonPrefix(new String[]{"apple", "ape", "april"});
		System.out.println(prefix);
	}

	String commonPrefix(String[] str)
	{
		int size=str.length;
		
		if(size==0)
			return "";
		if(size==1)
			return str[0];
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		int end=Math.min(str[0].length(), str[size-1].length());
		System.out.println(end);
		
		int i=0;
		while(i<end && str[0].charAt(i)==str[size-1].charAt(i))
			i++;
			String pre=str[0].substring(0, i);
			return pre;
	}
}

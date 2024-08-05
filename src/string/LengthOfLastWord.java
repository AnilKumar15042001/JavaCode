package string;

import java.util.Arrays;

public class LengthOfLastWord {
//Hello World
	public int lengthOfLastWord(String s)
	{
		s=s.trim();
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		
		return str[str.length-1].length();
	}
	
	public static void main(String[] args) {
		
		LengthOfLastWord obj=new LengthOfLastWord();
		System.out.println(obj.lengthOfLastWord("Hello World"));
	}
}

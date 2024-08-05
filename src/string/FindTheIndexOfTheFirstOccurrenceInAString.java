package string;

import java.util.ArrayList;
import java.util.List;

public class FindTheIndexOfTheFirstOccurrenceInAString {

	public int strStr(String haystack, String needle)
	{
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		FindTheIndexOfTheFirstOccurrenceInAString obj=new FindTheIndexOfTheFirstOccurrenceInAString();
		System.out.println(obj.strStr("leetcode", "leeto"));
	}
}

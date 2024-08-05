package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import array_ArrayList.Arraylist;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseWords rw=new ReverseWords();
//		rw.reverseWords("i love programming very much");
		rw.reverse("i love programming very much");
	}
	
	void reverseWords(String string)
	{
		String temp="";
		String[] words=string.split(" ");
		System.out.println(Arrays.toString(words));
		List list=new ArrayList();
		for(int i=words.length-1;i>=0;i--)
		{
			list.add(words[i]);
			
		}
		System.out.println(list);
	}
	
	void reverse(String str)
	{
		String[] words=str.split(" ");
		String[] word=new String[words.length];
		int x=0;
		for(int i=words.length-1;i>=0;i--)
		{
			word[x]=words[i];
			x++;
		}
		System.out.println(Arrays.toString(word));
	}

}

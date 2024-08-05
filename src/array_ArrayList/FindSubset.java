package array_ArrayList;

import java.util.Arrays;

public class FindSubset {

	public static void main(String[] args) {
		
		int[] arr= {11,1,13,21,3,7};
		int[] arr2= {11,3,7,1};
		
		for(int i=0;i<arr2.length;i++)
		{
			boolean found=false; 
			for(int j=0;j<arr.length;j++)
			{
				if(arr2[i]==arr[j])
				{
					found=true;
					System.out.print(Arrays.toString(arr2));
					break;
				}
			}
			if(!found)
			{
				System.out.println(" not subset");
			}
			else
			{
				System.out.println("subset");
			}
		}
	}
}

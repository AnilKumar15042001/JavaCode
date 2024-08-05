package array_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import array_ArrayList.Arraylist;

public class FindNeighboursPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindNeighboursPeakElement obj=new FindNeighboursPeakElement();
		int[] element=obj.peakElement(new int[]{10,20,15,2,23,90,67}, new int[]{10,20,15,2,23,90,67}.length);
		System.out.println(Arrays.toString(element));
	}
	
	int[] peakElement(int[] arr,int element)
	{
		int[] arr2=new int[element];
		for(int i=1;i<element-1;i++)
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
				arr2[i]=arr[i];
		return arr2;
	}

}

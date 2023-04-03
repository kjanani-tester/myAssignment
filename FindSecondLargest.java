package week2.day1_Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length = data.length;
		System.out.println("The second last value is : " +data[length-2]);
		
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i] +"  ");
		}
		
		
 
	}

}

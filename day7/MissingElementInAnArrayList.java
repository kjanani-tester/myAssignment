package week3.day2_homeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(6);
		arr.add(8);
		
Collections.sort(arr);
		
		int size=arr.size();
		
		for(int i=0;i<size;i++) {
			int j=i+1;
			if(arr.get(i)!=j)
			{
			System.out.println("Missing element is " +j);
			break;
			}
		}

	}

}

package week2.day1_Assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len=arr.length;
		int count;
		
		for(int i=0;i<arr.length-1;i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					System.out.print(arr[i] +" ");
				}
			}
		}
		

	}

}

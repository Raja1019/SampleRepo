package net.array;

public class CopyArray {

	public static void main(String[] args) {
		String[] arr = new String[] {"A","B","C","D"};
		System.out.println("First Array");
		for(int i = 0; i <arr.length; i++)
			System.out.println(arr[i]);
		int length = arr.length;
		String[] arr2 = new String[length];
		System.arraycopy(arr, 0, arr2, 0, 4);
		System.out.println("New Array copied");
		for(int i = 0;i <arr2.length; i++)
			System.out.println(arr2[i]);
		
			
 
	}

}

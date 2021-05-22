package com.Simplilearn.loops;

public class ForLoopTest {

	public static void main(String[] args) {
		// For Loop Test
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
				
		for (int i = 0;i<10;) { // expands for(int i=0; 1<10;i++)
			System.out.println("the Count value is:" +i);
			i+=1;
		}
		System.out.println("*********************");
		for (int i = 10; i >0; i--)
		{
			System.out.println("the Count value is:" +i);
		}
		System.out.println("*********************");
		for (int j:arr)
		{
			
			System.out.println("the array value is:" +j);
		}

	}
	

}

package com.arrays;

public class ArrayTraverse {

	
	public static void main(String[] args) {
		
	}
	
	boolean traverseArray(int[] arr,int num) {
		boolean flag = false;
		if (arr.length>0) 
		{
			for(int x : arr) 
			{
				if(x==num)
				{
					flag = true;
					break;
				}	
			
			}
		}
		else {
			return flag;
		}
		return flag;
		
		
		
	}
}

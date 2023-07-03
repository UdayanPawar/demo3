package com.externizable;

public class MissingNoOfArray {
	
	public static void main(String[] args) {
		int[]  a = {1,4,3,5};
		
		int n = a.length;
		int total=0;
		for(int i=1;i<=n+1 ; i++) {
			total = total + i;
		}
		
		int totalArray=0;
		for(int i=0; i<n;i++) {
			totalArray = totalArray + a[i];
		}
		
		int missing_no = total - totalArray;
		
		System.out.println("Missing_no ="+missing_no);
		
	}

}

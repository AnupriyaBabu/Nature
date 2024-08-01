package org.array;

public class Fruits {
	public static void main(String[] args) {
		String[] arr=new String[5];
		arr[0]="Apple";
		arr[1]="Orange";
		arr[2]="Grapes";
		arr[3]="Mango";
		arr[4]="Banana";
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(String arr1:arr) {
			System.out.println(arr1);
		}
	}
}

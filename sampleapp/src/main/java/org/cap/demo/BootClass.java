package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {
	System.out.println("hello world");
	show();
	

	}
	
	public static void show() {
		int[] arr= {12,34,56,56};
		int sum=0;
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
		}
		System.out.println("show method here!");
	}

}

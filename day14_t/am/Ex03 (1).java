package com.am;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] lotto= {2,44,32,12,38,8};
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.binarySearch(lotto, 12));
	}

}

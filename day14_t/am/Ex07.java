package com.am;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		//StringTokenizer
		String msg= "java,db,,web,framework";
		String[] arr1=msg.split(",");
		System.out.println(Arrays.toString(arr1));
		
		StringTokenizer stk=new StringTokenizer(msg,",");
		
		System.out.println("split length:"+arr1.length);
		System.out.println("token length:"+stk.countTokens());
		
//		while(stk.hasMoreTokens()) {
//			String temp=stk.nextToken();
//			System.out.println(temp);
//		}
		
		while(stk.countTokens()!=0) {
			System.out.println(stk.nextToken());
		}
		
	}

}














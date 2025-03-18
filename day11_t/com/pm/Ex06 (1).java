package com.pm;

public class Ex06 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.1.0)
		// 1. 1 ~ 45 랜덤숫자 생성
		int su=0;
		while(true) {
			su=(int)(Math.random()*1000);	// 0~99.99999
			if(su>0&&su<46)break;
		}
		System.out.println(su);
		// 2. 값의 치환
		int a=1111;
		int b=2222;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==2222&&b==1111);
		// 3. sort 알고리즘
		int[] arr= {3,2,1};
		int[] temp2= {0,0,0};

//		arr[0]=temp2[0];
//		if(arr[0]>temp2[1])arr[0]=temp2[1];
//		if(arr[0]>temp2[2])arr[0]=temp2[2];
		System.out.println(arr[0]);
		
//		arr[1]=temp2[1];
//		if(arr[1]>temp2[2])arr[1]=temp2[2];
		System.out.println(arr[1]);
		
//		arr[2]=temp2[2];
		System.out.println(arr[2]);
	}

}











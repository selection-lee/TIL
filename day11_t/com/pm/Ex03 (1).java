package com.pm;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] arr1= {-2,-1,0,1,2};
		for(int i=0; i<=arr1.length; i++) {
			
			try {
					System.out.println(0/arr1[i]);
			}catch(java.lang.ArithmeticException e) {
				System.out.println("0���� ������");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index �����");
			}catch(RuntimeException e) {
				System.out.println("������ ����");
			}
			
		}
	}

}








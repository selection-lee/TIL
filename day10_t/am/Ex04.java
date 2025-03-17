package com.am;

public class Ex04 {

	public static void main(String[] args) {
		Integer target=new Integer(10);
		Integer target2=new Integer(111);
		System.out.println(target.byteValue());// 0~255->-128~127
		System.out.println(target.shortValue());
		System.out.println(target.intValue());
		System.out.println(target.longValue());
		System.out.println(target.floatValue());
		System.out.println(target.doubleValue());
		System.out.println(target==target2);
		System.out.println(target.intValue()==target2.intValue());
		System.out.println(target.equals(target2));
		System.out.println(target+1);
		System.out.println(target.toString()+1);
		System.out.println(Integer.valueOf(target)+1);
		System.out.println(Integer.valueOf(target.toString())+1);// return Integer
		System.out.println(Integer.parseInt(target.toString())+1);// return int
		int su=16;
		System.out.println("2���� "+su+"="+Integer.toBinaryString(su));
		System.out.println("8���� "+su+"=0"+Integer.toOctalString(su));
		System.out.println("16���� "+su+"=0x"+Integer.toHexString(su));
		System.out.println("min:"+Integer.min(3, 5));
		System.out.println("max:"+Integer.max(3, 5));
		System.out.println("sum:"+Integer.sum(3, 5));
		System.out.println(Integer.bitCount(9));
		System.out.println(Integer.reverse(1)+1);
		// a,b a==b:0, a>b:1, a<b:-1 
		System.out.println(Integer.compare(3, 3));
		System.out.println(Integer.compare(3, 33));
		System.out.println(Integer.compare(3, 333));
		System.out.println(Integer.compare(3, 5));
		System.out.println(Integer.compare(5,3));
		System.out.println(target.compareTo(target2));
	}

}















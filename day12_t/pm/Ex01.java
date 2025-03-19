package com.pm;

public class Ex01 {

	public static void main(String[] args) {
		java.util.ArrayList list=new java.util.ArrayList(100000);	//걸린시간:16ms 걸린시간:17.045s
//		java.util.LinkedList list=new java.util.LinkedList();//걸린시간:16ms 걸린시간:46.773s
		long before=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add("item"+i);
		}
		long after=System.currentTimeMillis();
//		String msg="";
//		for(int i=0; i<100000;i++) {
//			msg+=list.get(i).toString();
//		}
		System.out.println("걸린시간:"+(after-before)+"ms");
		System.out.println("걸린시간:"+(after-before)/1000.0+"s");
		
	}

}
















package com.pm;

public class Ex01 {

	public static void main(String[] args) {
		java.util.ArrayList list=new java.util.ArrayList(100000);	//�ɸ��ð�:16ms �ɸ��ð�:17.045s
//		java.util.LinkedList list=new java.util.LinkedList();//�ɸ��ð�:16ms �ɸ��ð�:46.773s
		long before=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add("item"+i);
		}
		long after=System.currentTimeMillis();
//		String msg="";
//		for(int i=0; i<100000;i++) {
//			msg+=list.get(i).toString();
//		}
		System.out.println("�ɸ��ð�:"+(after-before)+"ms");
		System.out.println("�ɸ��ð�:"+(after-before)/1000.0+"s");
		
	}

}
















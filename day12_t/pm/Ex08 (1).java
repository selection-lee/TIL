package com.pm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Ex08 {

	public static void main(String[] args) {
		// �̷л� - ������ ����
		// ��ǻ� - ������ �ִ�
		// �ߺ�����
		List list=new ArrayList();
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		list.add("�ټ���°");
		list.add("ù��°");
		System.out.println("list size:"+list.size());
			
		java.util.Set set1=new HashSet();
		java.util.Set set2=new HashSet(list);
//		set2.add("������°");
		set1.addAll(list);
		System.out.println("set size:"+set1.size());
		System.out.println(set1.equals(set2));
		
		java.util.Iterator ite=set1.iterator();
		while(ite.hasNext()) {
			Object obj=ite.next();
			System.out.println(obj);
		}
		
	}

}

package com.am;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		// ���׸� - ����
		// 1.5~
		// E,K,V,T,...
		// ��������Ÿ��
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
//		list.add(3.14);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		for(int i=0; i<list.size(); i++) {
			int msg=list.get(i);
			System.out.println(msg);
		}
	}

}




















package com.am;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		//(������ ������)������ �ְ� �ߺ����
		// 						key, value
		// key -set- ��, �ߺ��� ����(����), all type, null ���
		// value -list- �ߺ����, all type, �� ���������ʴ� Ű�� null
		
		// ���Ŀ��� key �ǵ��� ���ڿ� ��뼱ȣ
		Map map1=new HashMap();
//		Map map1=new TreeMap();
		
//		map1.put("Ű1",null);
		map1.put("Ű2",2);
		map1.put(true,"��3");
//		map1.put("Ű4",null);
		map1.put(5,"��5");
//		map1.put(null,"��6");
//		map1.put(null,"edit6");
//		map1.replace(null,"edit6");
//		map1.remove(null);
		
//		map1.clear();
//		System.out.println(map1.containsKey(null));
		System.out.println(map1.containsValue(null));
		
//		System.out.println(map1.get("Ű1"));
//		System.out.println(map1.get("Ű2"));
//		System.out.println(map1.get(true));
//		System.out.println(map1.get("Ű4"));
//		System.out.println(map1.get(5));
//		System.out.println(map1.get(null));
		Collection list = map1.values();
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}












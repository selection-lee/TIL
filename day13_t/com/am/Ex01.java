package com.am;
/**
 * 8. generic
 * 9. java.util
 * 10. ui
 * 11. event
 * 12. io
 * 13. thread
 * 14. java.net
 */
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		//�ߺ����
		List list1=new ArrayList();
		list1=new LinkedList();
		
		//
		Queue que1=new LinkedList();
		Deque que2=new LinkedList();
		Stack stack=new Stack();
		
		//
		Vector vec1=new Vector();
		Vector vec2=new Stack();
		
		//�ߺ�����
		Set set1= new HashSet();
		set1.add("ù��°");
		set1.add("�ι�°");
		set1.add("����°");
		set1.add("����°");
		set1.add("�׹�°");
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}















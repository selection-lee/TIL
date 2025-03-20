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
		//중복허용
		List list1=new ArrayList();
		list1=new LinkedList();
		
		//
		Queue que1=new LinkedList();
		Deque que2=new LinkedList();
		Stack stack=new Stack();
		
		//
		Vector vec1=new Vector();
		Vector vec2=new Stack();
		
		//중복불허
		Set set1= new HashSet();
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");
		set1.add("세번째");
		set1.add("네번째");
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}















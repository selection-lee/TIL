package com.am;
import java.util.*;
import java.util.Map.*;
public class Ex08 {
    public static void main(String[] args) {
        Map</*key, value 명세*/ String, String> map = new HashMap<String, String >();
        map.put("","");
//        map.put(111,""); // String 말고 다른 거 들어가면 에러
//        map.put("",222); // 마찬가지
        Set<String> set1 = map.keySet(); // key 는 String 이니까..
        Set<Entry<String, String>> set2 = map.entrySet();
        // 이거의 iter 객체 뽑으면?
        Iterator<Entry<String, String>> ite = set2.iterator();

    }
}

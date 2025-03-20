package com.am;
import java.util.*;
import java.util.Map.Entry;

public class Ex05 {
    public static void main(String[] args) {
        Map map = new HashMap();
        String[] keys1 ={"key1","key2","key3","key4"};
        map.put(keys1[0],"val1");
        map.put(keys1[1],"val2");
        map.put(keys1[2],"val3");
        map.put(keys1[3],"val4");

        for (int i = 0; i < keys1.length;i++) {
            System.out.println(keys1[i] + ":"+map.get(keys1[i]));
        } // key1:val1 key2:val2 ...

        Set keys2 = map.keySet();
        /* Iterator ite = keys2.iterator();
        while (ite.hasNext()) {
            Object key = ite.next();
            Object val = map.get(key);
//            System.out.println(ite.next()); // key1 key2 ...
            System.out.println(key + " : " + val); // key1 : val1 ...
        } */
        // 반드시 iterator 객체 써야 하는 건 아님
        /* Object[] keys3 = keys2.toArray();
        for (int i = 0; i < keys3.length; i++) {
            Object key = keys3[i];
            Object val = map.get(key);
            System.out.println(keys3[i]); // key1 key2 ...
            System.out.println(key + ": " + val); // key1: val1 ...
        } */

        //
        Set entrys = map.entrySet(); // set type 으로 받되, set타입의 entry를 만든다
        Iterator ite2 = entrys.iterator();
        while (ite2.hasNext()) {
            Object obj = ite2.next(); // 얘의 원형은 entry
            // 그래서 ??? 객체를 활용..? 못들었따ㅠㅠ
            Entry entry = (Entry) obj; // java.util.map.Entry
            System.out.println(entry.getKey() + " : " + entry.getValue()); // key1 : val1 ...
        }
    }
}

package com.am;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        // (유저가 정의한) 순서가 있고 중복허용
        //                         key, value
        // 단, key는 중복 불허 (값을 교체할 때 제외하면..)
        // ket - 중복불허(수정가능), all type, null 허용
        // value - 중복허용, ㅁll type, 단 존재하지 않는 키값 null
        
        // 추후에는 key 되도록 문자열 사용 - 그러란 법은 없지만,,
        Map map1 = new HashMap();

        map1.put("key1", "val1");
        map1.put("key2", true);
        map1.put("key3", "val3");
        map1.put(null, "val4");
        map1.put("key3", "val5"); // 중복 선언하면 뒤에꺼나옴
        map1.replace(null, "edit6");
//        map1.remove(null)); // 왜 아니 에러가 왜 나지..
//        System.out.println(map1.getClass().get("key3"));
        System.out.println(map1.get(null)); // key가 null이면 걍 n
        System.out.println(map1.get("key5")); // 없는 키 찾으면 null 나옴
        // key, val은 기본적으론 object임....
        // "keyN" 대신 1,2,3 이런거 넣어도 되고
        // key 끼리의 자료형이 달라도 , val 끼리의 자료형이 달라도 멀쩡히 잘 나옴. 상관없음
        // 하다못해 int, Str 아닌 bool값, null을 넣어도...! 상관없이 잘 됨
    }
}

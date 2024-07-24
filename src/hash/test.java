package hash;

import java.util.HashMap;

public class test {

    private static void Loop(String[] part) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < part.length; i++) {
            map.put(part[i], i + 1); // i+1로 설정하여 1, 2, 3을 순차적으로 넣음
        }
        System.out.print(map);
    }
    public static void main (String[]args) {
        HashMap<String, Integer> map = new HashMap();
        String[] part = {"dog", "cat", "snake"};
        int testNum = 5;
        map.put("testKey", testNum); //두번째 방법

        for(String test : part){
         //   map.put(test, testNum);  <- 이렇게 사용하거나
            map.put(test, map.get("testKey")); //두번째 방법 2
        }
        map.remove("testKey");
        //System.out.print(map);

        Loop(part);
    }

}
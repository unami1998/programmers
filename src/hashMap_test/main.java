package hashMap_test;

import java.util.HashMap;

public class main {
    private static void want_student(HashMap<String, String> phoneBook, String name) {
        String want_infor = phoneBook.get(name);  //key에 해당하는 values의 값 나오게
        System.out.println(name +"의 데이터" + want_infor);

    }
    public static void main(String args[]){
        HashMap<String, String> phoneBook = new HashMap<>();

        // 전화번호부에 항목 추가
        phoneBook.put("Alice", "010-1234-5678");
        phoneBook.put("Bob", "010-8765-4321");
        phoneBook.put("Charlie", "010-1357-2468");

        //제거
        phoneBook.remove("Bob");

        want_student(phoneBook, "Alice");

    }


}

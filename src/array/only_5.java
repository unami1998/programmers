package array;

import java.util.ArrayList;
import java.util.List;

public class only_5 {

    public static int[] solution(int l, int r) {
        //5만 나오게 일단 해보자
        ArrayList<Integer> ListAnswer = new ArrayList<>();
        boolean flag = true;
        for (int i = l; i <= r; i++) {    // <-l~r 까지의 범위만큼 하나씩 가져온다
            String str = String.valueOf(i);  //str을 위한 반복문이 필요하다

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '5' && str.charAt(j) != '0') {
                    flag =false; //없어
                    break;
                }
            }
            if (flag) {
                ListAnswer.add(i);
            }
            flag=true;
        }

        System.out.print("ListAnswer->" + ListAnswer);

        if (ListAnswer.isEmpty()) {
            System.out.print("-1");
            return new int[]{-1};
        } else {
            int[] answer = new int[ListAnswer.size()];
            for (int j = 0; j < ListAnswer.size(); j++) {
                answer[j] = ListAnswer.get(j);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int l = 5, r = 555;
        solution(l, r);
    }
}

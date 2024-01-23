import java.util.ArrayList;

public class binaryScale {
    static class Solution {
        public int[] solution(String s) {
            //이 문제의 핵심->String을 char로 String.valueOf
            // 형 변환이 핵심


            int count = 0;
            char a = ' ';

            for (int i = 0; i < s.length(); i++) {
                a = s.charAt(i);
                if (a == '1') {
                    count++;  //그럼 1이 세 개 나오겠지?
                }
            }
            int[] number = new int[count];  //3이 들어간다, new int[3]

            for (int j : number) {
                number[j] = 1;
            }        ///111이 나온다

            System.out.print("2씩 거듭제곱->");
            int newCount = 0;
            for (int i = 0; i<number.length; i++) {
                number[i] = 1<<i;   // <-1 1 1 을 -> 1 2 4 2진법으로
                System.out.print(number[i] + " ");
                newCount += number[i];
            }

            System.out.println("newCount값->" + newCount);  //7이 나오고,

            //2^4 =
            System.out.print("10진법이 된 newCount값->");
            int[] finishNumber = new int[newCount];

            for (int b = 4; b >= 0; b--) {
                if ((newCount >> b & 1) ==1) {
                    System.out.print(1);
                    finishNumber[b] = 1;
                }
            }
            System.out.print("이게 다시 10진법 ->");
            for (int i = 0; i<number.length; i++) {
              System.out.print(finishNumber[i]);
            }
            int[] answer = {};

//            String finish = Integer.toBinaryString(newCount);
//            System.out.println("finish->" + finish);  //111이 나온다 ,
            return answer;
        }
    }

    public static void main(String args[]) {
        Solution testSolution = new Solution();
        String a = "01110";
        testSolution.solution(a);
    }
}

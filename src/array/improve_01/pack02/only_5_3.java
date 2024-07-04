package array.improve_01.pack02;

import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> listAnswer = new ArrayList<>();
        int DecimalNum = 5;   //10진법을 얘기한다
        int BinaryNum = 1; //2진법 사용하려고만들었다
        String BinaryString;  // 1 10 11 100 101
        String FiveBinaryString;// 5 50 55 500
        while(DecimalNum < r){
            BinaryString = Integer.toBinaryString(BinaryNum); //2진법 String으로 바꾸겠다
            FiveBinaryString = BinaryString.replace('1','5');  //100 -> 500
            DecimalNum = Integer.parseInt(FiveBinaryString);
            if(DecimalNum >= l && DecimalNum <=r){
                listAnswer.add(DecimalNum);
            }
            BinaryNum++; // 1 이후엔 10 이 된다.
        }
        int[] answer = listAnswer.stream().mapToInt(i->i).toArray(); //List를 배열로 만들어준다
        if(answer.length == 0) {
            answer = new int[] {-1};
        }
        return answer;
    }
}
public class only_5_3 {

    public static void main(String[] args){

    }


}

package project2;

public class BinaryScale {
    ///프로그래머스 이진 변환 반복하기


    public static void main(String[] args) {
        Solution testSolution = new Solution();
        String a = "01110";
        int[] result=  testSolution.solution(a);

        for (int r:result){
            System.out.println(r);
        }
    }
}

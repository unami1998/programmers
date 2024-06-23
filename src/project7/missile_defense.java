package project7;

import java.util.Arrays;
//요격시스템 문제
public class missile_defense {
    public static int solution(int[][] targets) {
      int answer = 0;

        // targets 배열을 종료 시점에 따라 정렬
//        Arrays.sort(targets, (o1, o2) -> {
//            if (o1[1] == o2[1]) {
//                return o1[0] - o2[0];
//            }
//            return o1[1] - o2[1];   //오름차순   o2[1]-o1[1]은 내림차순
//        });

        Arrays.sort(targets,(o1,o2)-> o1[1]-o2[1]); //target[i][뀨뀨] 뒤를 기준으로 오름차순한다,
        //    Arrays.sort(targets,(o1,o2)-> o2[0]-o1[0]); 앞을 기준으로 target[뀨뀨][i]를 내림차순해보장
        //Arrays.sort(targets,(o1,o2)-> o1[2]-o2[2]); target[i][2]를 기준으로 오름차순하겠습니뭉

        int count =1;
        int rememberMax = targets[0][1];  //마지막에 쏜 곳을 기억하는데 제일 처음있는 타겟의 마지막 숫자로 초기화한다.
        for(int i=1; i<targets.length; i++){
            //비교할 땐 앞에 있는 애랑 비교해야지
            if(targets[i][0] >= rememberMax){  //맞은 범위에 안들어갔다
                count++;
                rememberMax = targets[i][1];   //(4,5)에서 5를 기억해야하기 때문에, 현재 위치에서 두 번째인 놈을 기록해준 거다.
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};

        int result = solution(targets);
    }
}

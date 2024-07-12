package conveyor_belt;

import java.util.Scanner;



public class studyArray {
//    private static int Company(int belt_length, int k) {  //내구도 개숫가 k개 이상이라면 멈춘다
//        //컨베이어 벨트도 같이 움직여야하기 때문에 이걸 이차원배열로 할지 고민하고
//        //N일 때 로봇하차
//        //n~2n일 땐 로봇 탑승 못함
//
//        //belt_length = belt_length *2;
//
//
//    }

    public static void main(String[] args) {

//        int beltLengthResult = Company(3, 2);
//        System.out.print(beltLengthResult);
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] belt = new int[N*2]; //밑에도 있으니깐

        for (int i = 0; i < N * 2; i++) {  //내구도 입력해라
            belt[i] = scanner.nextInt();
        }
        int startPoint = 0;
        int endPoint = N - 1; //하차 지점
        boolean[] robot_road = new boolean[N];  //<-robot_road는 robot_road[6] 인 상태   //robot_position

//        for(int i =0; i<robot_road.length; i++){
//            robot_road[i] = true;
//        }

        while (K != count) { //k와 count가 같아지면 종료한다
            for (int i = 2 * N - 1; i >0; i--) { //로봇을 올리자
//                if (!robot_road[i - 1] && robot_road[i] && belt[i] > 0) {
                  //  robot_road[i] = 0;
                    //robot_road[i - 1] = 1;
                   // belt[i]--;
                    startPoint++;

                //    robot_road[endPoint] = 0;  //N일 때 로봇 하차시켜야함
                    endPoint++;
              //      robot_road[startPoint]=1;
                    if (belt[i] == 0) {
                        count++;
                    }

                    if(startPoint==N*2){
                        startPoint=0;
                    }
                    if(endPoint ==N*2){
                        endPoint = 0;
                    }
                }
            //}
            if (K == count) break;
        }

        //출력되는 값
        System.out.print(count);

    }
}

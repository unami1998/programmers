package conveyor_belt;

import java.util.Scanner;

public class other_explan {
    public static void main(String[] args){
        int res;
        int N,K; //k의 역할은 0이 되는 갯수만큼 차감시켜준다면 종료가되게찌!
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();
        int[] belt = new int[N*2];
        boolean[] robot = new boolean[N];
        for (int i = 0; i < N * 2; i++) {
            belt[i] = scanner.nextInt();
        }
        res = 0;
        while (K > 0) {
            int temp = belt[N * 2 - 1];
            for (int i = N * 2 - 1; i > 0; i--) {   //벨트 내구도 한칸씩 땡김
                belt[i] = belt[i - 1];
            }
            belt[0] = temp;

            for (int i = N - 1; i > 0; i--) {   //로봇 한칸씩 땡김
                robot[i] = robot[i - 1];
            }
            robot[N - 1] = false; //로봇을 떨궈야하기 때문에 false
            robot[0] = false; //처음 탑승하고 한단계 나아가기 때문에 false 박음 (추정)

            for (int i = N - 1; i > 0; i--) { //로봇 앞에 아무것도 없으면 걸어가겠다, 맨 마지막 부분
                if (!robot[i] && robot[i - 1] && belt[i] > 0) { //robot[i] 위치에 로봇이 없다, 해당 칸에도 로봇이 없어야하고, 그 다음칸에도 로봇이 없어야하는데 로봇은 존재해야한다.
                    //[i]는 내가 가야할 위치, [i-1]은 원래 위치
                    belt[i]--;
                    if (belt[i] == 0) {
                        K--;
                    }

                    robot[i] = true; //내가 가야할 위치에 로봇이 걸어갔기 때문에 true가 되버렸다
                    robot[i - 1] = false;  //로봇 원래 위치는 기존의 로봇이 가버렸기 때문에 false가 되버렸다

                    //만약 32번째 줄에서 i>=을 하면 41번째에서 0-1을 하게되면, robot[-1] 은 존재하지 않기 때문에 터진다.
                }
            }

            if (belt[0] > 0) {       //0번째에 로봇을 올릴 수 있으면 올리는 코드
                belt[0]--;
                if (belt[0] == 0) {
                    K--;
                }
                robot[0] = true;  //robot[0]에 true를 넣는다.<-첫번째 위치에 로봇을 올린다.
            }
            res++;  //while이 몇번 돌았는지 알기 위해서징~~
        }

        System.out.println(res);
    }
}

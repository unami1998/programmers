package conveyor_belt;

import java.util.Scanner;

public class other_explan {
    public static void main(String[] args){
        int res;
        int N,K;
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
            for (int i = N * 2 - 1; i > 0; i--) {
                belt[i] = belt[i - 1];
            }
            belt[0] = temp;

            for (int i = N - 1; i > 0; i--) {
                robot[i] = robot[i - 1];
            }
            robot[N - 1] = false;
            robot[0] = false;

            for (int i = N - 1; i > 0; i--) {
                if (!robot[i] && robot[i - 1] && belt[i] > 0) {
                    belt[i]--;
                    if (belt[i] == 0) {
                        K--;
                    }

                    robot[i] = true;
                    robot[i - 1] = false;
                }
            }

            if (belt[0] > 0) {
                belt[0]--;
                if (belt[0] == 0) {
                    K--;
                }
                robot[0] = true;
            }
            res++;
        }

        System.out.println(res);
    }
}

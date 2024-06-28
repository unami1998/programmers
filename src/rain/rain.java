package rain;

import java.util.Scanner;

public class rain {
    public static void main(String[] args){

        System.out.print("빗물 가로 길이 배열 만들어보자");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int[][] land = new int[height][width];
        System.out.print("land의 크기는 어떻게될까요?" + land.length + "그러면 width의 크기는" + land[0].length);

    }
}

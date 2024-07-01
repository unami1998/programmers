package rain;

import java.util.Scanner;

public class rain {
    public static void main(String[] args) {

        System.out.print("빗물 가로 길이 배열 만들어보자");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.nextLine();
        String[][] land = new String[height][width];
        System.out.print("height 크기는 어떻게될까요?" + land.length + "그러면 width의 크기는" + land[0].length);

        System.out.print("방벽을 입력해볼까?");
        String input_barrier = scanner.nextLine().trim(); //양쪽 공백 제거
        String[] parts = input_barrier.split("\\s+");
        int[] barrier = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            barrier[i] = Integer.parseInt(parts[i]);
        }

        //이제 barrier[i] = {3,0,1,4}가 된 상태다

        for (int col = 0; col < barrier.length; col++) {
            for (int j = 0; j < barrier[col]; j++) {
                land[height - j-1][col] = "*";  //barrier=3
            }
        }


        for (int i = 0; i < land.length; i++) {  //높이
            for (int j = 0; j < land[i].length; j++) { //가
                if (land[i][j] == null) {
                    System.out.print("0 ");
                } else {
                    System.out.print(land[i][j] + " ");
                }
            }
            System.out.println();
        }


        int count=0;
        for (int H = 0; H < land.length; H++) {  //높이
            for (int j = 0; j < land[H].length; j++) { //가
                if (land[H][p-1].contains("*") && land[H]) {
                    count++;
                }
            }
        }
        System.out.print("count" + count);


    }
}

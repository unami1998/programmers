package project6;

public class WalkinthePark {
    public int[] WalkinthePark(String[] park, String[] routes) {
        int x = -1;
        int y = -1;
        int height = park.length;        //공원 높이
        int weight = park[0].length();    //공원 넓이

        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf('S') != -1) {  //park에 S가 있을 때 시작된다,
                x = park[i].indexOf('S');
                y = i;
            }
        }
        String vector = "";   // <-동서남북 입력할거다
        int currX = x;       // <- E는 +, W는 -
        int currY = y;        //<- N는 +, S는 -


        String[] direction_info;
        int distan;
        System.out.println();

        int[] answer = new int[2]; //이동한 값을 넣어줄거다

        for (int i = 0; i < routes.length; i++) {
            direction_info = routes[i].split(" "); //여기서 문자열로 분리할거다
            vector = direction_info[0]; // "W 2" 일 때 W
            distan = Integer.parseInt(direction_info[1]);  //W 2일 때 2

            if (vector.equals("E")) {
                for (int j = 0; j <= distan; j++) {
                    currX++;  //currx만큼 distance 증가
                    answer[1]++;
                    if (currX>= weight || park[currY].charAt(currX) == 'X') break;
                }
            }
            else if (vector.equals("W")) {
                for (int j = 0; j <= distan; j++) {
                    currX--;
                    answer[0]--;
                    if (currX<= weight ||park[currY].charAt(currX) == 'X') break;

                }
            } else if (vector.equals("S")) {
                for (int j = 0; j <= distan; j++) {
                    currY--;
                    answer[1]--;
                    if (currX>= height ||park[currY].charAt(currX) == 'X') break;

                }
            } else {  //N
                for (int j = 0; j <= distan; j++) {
                    currY++;
                    answer[1]++;
                }
                if (currX<= height || park[currY].charAt(currX) == 'X') break;
            }
        }
        answer[0]=y;
        answer[1]=x;
        System.out.print("[y좌표->" + answer[0] + "x좌표" + answer[1]);

       return answer;

    }
}

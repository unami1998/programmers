package project6;

public class WalkinthePark {
    public int[] WalkinthePark(String[] park, String[] routes) {

        //자세한 그림판으로 2차원 배열 설명 그림 -> https://www.notion.so/7452cc82e80f49ceab727405a9d7e3de
        //니가 한 치명적인 실수->

        //  if (currX>= weight || park[curryY].charAt(currX) == 'X') break;
        // 이런식으로 할 때, for loop 밖에서 정의된 변수라 음수를 가질 수 있다
        // 고로 for문 안에서 있는 변수명을 쓰거나 해라

        //그리고 너가 또 한 한가지 실수
        //Index -1 out of bounds for length 3 이건 배열에서 생기는 문제인데
        //너는 그걸 알면서 for문을 수정하고 for문 안에 있는 변수들을 고치고있었다

        //정확하게 오류가 난 이유 와 파란색 줄도 무시하지말고 제대로 봐라

        //너 이거 하나 때문에 0126 이 날 하루 다 잡아먹었다 만만하게 생각하지말고 꼼꼼하게 봐

        int x = -1;
        int y = -1;
        int height = park.length - 1;        //공원 높이
        int weight = park[0].length() - 1;    //공원 넓이

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

        int[] answer = new int[2]; //이동한 값을 넣어줄거다

        boolean flag = true;

        for (int i = 0; i < routes.length; i++) {
            direction_info = routes[i].split(" "); //여기서 문자열로 분리할거다
            vector = direction_info[0]; // "W 2" 일 때 W
            distan = Integer.parseInt(direction_info[1]);  //W 2일 때 2
            if (vector.equals("E")) {
                for (int j = 0; j < distan; j++) {
                    if (currX >= weight || park[j].charAt(currX) == 'X') {
                        flag = false;  //가다가 되돌아가야한다, 없으면 멈춘다.  52를 하기 위해서 존재한다
                        break;
                    }
                    currX++;  //currx만큼 distance 증가
                }
                if (flag) x = currX;    //가다가 되돌아가야하기 때문에 flag 선언
            } else if (vector.equals("W")) {
                for (int j = 0; j < distan; j++) {
                    if (currX <= 0 || park[j].charAt(currX) == 'X') {
                        flag = false;
                        break;
                    }
                    currX--;
                }
                if (flag) x = currX;

            } else if (vector.equals("N")) {
                for (int j = 0; j < distan; j++) {
                    if (currX <= 0 || park[j].charAt(currX) == 'X') {
                        flag = false;
                        break;
                    }
                    currY--;
                }
                if (flag) y = currY;
            } else {  //S
                for (int j = 0; j < distan; j++) {
                    if (currY >= height || park[j].charAt(currX) == 'X') {

                        flag = false;
                        break;
                    }
                    currY++;
                }
                if (flag) y = currY;
            }
            flag = true;
            currX=x;  //현재 x, y 좌표 저장한다, 이전기록을 지워줘야한다
            currY=y;

            System.out.println(park[i] + "  x,y좌표 출력->" + x + "," + y
                +"     currX" + currX + "      currY" + currY);
        }
        answer[0] = y;
        answer[1] = x;
  //      System.out.print("[y좌표->" + answer[0] + "x좌표" + answer[1]);

        return answer;

    }
}

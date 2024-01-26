package project5;

import java.util.Arrays;

public class MaratonRace {


    public String[] maratonRace(String[] players, String[] callings) {

        //Hash를 쓰면 시간복잡도가 줄어든다 하지만 그걸 쓰지않고
        //배열, 기존에 있는걸로 쓰자

        String tempPlayer = "";
        String[] answer;
        //뭘 선언했을 때 값이 증가하는지, 그걸 파악을 먼저해라
        //몇명있는지는 중요하지않다,
        //calling이 될 때마다 (새로운 순위) 증가해야하기때문에 calling.length까지 반복문돌린다
        for (int i = 0; i < callings.length; i++) { //불린 놈이 먼저가 되어야한다
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(callings[i])) { //방금 불린 애가 아니면 되지않는다
                    // 배열의 값을 앞으로 이동시킴
                    tempPlayer = players[j];
                    players[j] = players[j - 1];
                    players[j - 1] = tempPlayer;

                    // 호출된 내용을 출력
                }
            }
        }
        answer = players;
        System.out.print(Arrays.toString(answer));


        return answer;
//        /////////////////////////////////////////////////
//
//        for(String call:callings) {
//            for (int j = 0; j < players.length; j++) {
//                if (players[j].equals(call)) {
//                    if (j > 0) { //방금 불린 애가 아니면 되지않는다
//                        // 배열의 값을 앞으로 이동시킴
//                        tempPlayer = players[j];
//                        players[j] = players[j - 1];
//                        players[j - 1] = tempPlayer;
//                        // 호출된 내용을 출력
//                    }
//                    System.out.println(Arrays.toString(players));
//                }
//            }
//        }


    }
}


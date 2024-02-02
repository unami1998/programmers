package project5;

import java.util.Objects;

public class MaratonRace {
    public MaratonRace(String[] players, String[] callings) {

        String tempPlayer = "";
        //calling을 한번 할 시 변경되는걸 한번 해보자
//        tempPlayer = callings[i];  //지금 현재로선 kai다
//        for(int i=0; i<players.length; i++){
//            System.out.print(players[3]);
//        }

        while (true) {
            for (int i = 0; i < players.length; i++) {
                if (players[i].equals(callings[i])) {  //나중엔 temp 이거 수정해라 임시로 만든거다
                    tempPlayer = players[i];
                    players[i] = players[i - 1];
                    players[i - 1] = tempPlayer;
                    System.out.print("해당 번호" + i + "이름" + players[i]);
                }
            }
        }

    }


}

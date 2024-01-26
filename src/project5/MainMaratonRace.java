package project5;

import java.util.Arrays;

public class MainMaratonRace {
    public static void main(String[] srgs){

        //=======나미씨가 정리한 문제==========
        //player 는 경주에 참가하는 사람들이다, 이 때
        //calling은  추월했다는 의미이다.
        // calling에 해당 이름이 나올 시, 해당하는 사람의 앞에 있는, (왼쪽에 있었던), (내 앞에 있었던), (내 직전에 있던)
        //본인의 왼쪽 문자에 있었던, 즉 내 등수보다 앞에 있었던 player와 바뀌게된다
        // 그리고 최종 calling이 끝났을 시 경기가 끝나며 최종 player, 즉 경기가 끝난 후 사람들이 추월했었던(calling)
        // calling의 과정으로 변동되었던 player들이 문자열로 해당 바뀐 player들의 문자들을 출력해라.

        //======강호영이 정리한 문제=============
        // players는 현재 참가한 플레이어의 순위순서로 리스트되어있다.(0<- 제일 앞 .... lastIndex -> 제일뒤)
        // calling을 하면 해당 플레이어가 앞의 (-1) 플레이어를 추월한다.
        // 최후의 플레이어 순서를 출력한다.

        String[] players = new String[]{"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = new String[]{"kai", "kai", "mine", "mine"};

       new MaratonRace().maratonRace(players,callings);


    }
}

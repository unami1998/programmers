package Elevator;

import java.util.Random;

public class elevator {
    public static void main(String[] args){
       /* 엘리베이터가 6대
        층은 50층까지
        사람들이 랜덤으로 타고있다 (1150kg 미만으로)
        한번 더 원하는 층을 입력하면 우선순위에 들어감*/

        int person = 0;
        int[][] destinationCounts = new int[6][50];  //내가 선택한 엘리베이터, 내가 선택한 층수
        int[] elevatorCounts = new int[6];
        Random random = new Random();
        int totalWeight =0;
        int count=0;
        while(totalWeight<=1150){
            int personWeight = random.nextInt(30)+60;
            if(totalWeight+person<=1150){
                totalWeight += personWeight;
                count++; //탄 사람들
                int selectedElevator = random.nextInt(6); //5대의 엘리베이터
                int selectedFloor = random.nextInt(50)+1; //50층 까지 있다
                destinationCounts[selectedElevator][selectedFloor]++;
                elevatorCounts[selectedElevator]++; //많이 누른 층 수를 증가할거다
                System.out.println("현재 탑승 인원" +count+"명" + "누른 층"+selectedFloor);
            }else{
                System.out.println("현재 totalWeight=" +totalWeight);
                break;
            }
        }
        System.out.println("===== 제일 많이 선택된 내리고 싶은 층 =====");
        int[] totalDestinationCounts = new int[50]; //층수를 넣을 거니깐
        for (int floor = 0; floor < 50; floor++) {
            for (int elevator = 0; elevator < 6; elevator++) {
                totalDestinationCounts[floor] += destinationCounts[elevator][floor];
            }
        }
        int maxCount = 0;
        int maxFloor = -1;
        for (int want_floor = 0; want_floor < 50; want_floor++) {
            if (totalDestinationCounts[want_floor] > maxCount) {
                maxCount = totalDestinationCounts[want_floor];
                maxFloor = want_floor;
            }
        }

        System.out.println("가장 많이 선택된 내리고 싶은 층: " + maxFloor + "층, 인원 수: " + maxCount + "명");


    }
}

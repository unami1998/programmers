package Elevator;

import java.util.Random;

public class elevator2 {

    static class Person {
        int startFloor;
        int endFloor;
        int weight;

        Person(int startFloor, int endFloor, int weight) {
            this.startFloor = startFloor;
            this.endFloor = endFloor;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int[][] persons = new int[50][3]; // 각 사람의 시작 층, 목적지 층, 몸무게
        int[][] destinationCounts = new int[6][50]; // 엘리베이터별 목적지 층 선택 횟수
        int[] elevatorCounts = new int[6]; // 각 엘리베이터에 몇 명이 탔는지
        int[] elevatorPositions = new int[6]; // 각 엘리베이터의 현재 위치
        Random random = new Random();
        int totalWeight = 0;
        int count = 0;

        while (totalWeight <= 1150) {
            int personWeight = random.nextInt(30) + 60;
            if (totalWeight + personWeight <= 1150) {
                totalWeight += personWeight;
                count++; // 탄 사람들
                int startFloor = random.nextInt(50) + 1; // 시작 층
                int endFloor = random.nextInt(50) + 1; // 목적지 층

                Person person = new Person(startFloor, endFloor, personWeight);
                persons[count - 1][0] = startFloor;
                persons[count - 1][1] = endFloor;
                persons[count - 1][2] = personWeight;

                // 사람의 현재 위치와 엘리베이터의 현재 위치를 비교하여 가장 가까운 엘리베이터를 선택
                int closestElevator = findClosestElevator(startFloor, elevatorPositions);
                elevatorPositions[closestElevator] = startFloor; // 해당 엘리베이터의 위치를 업데이트

                destinationCounts[closestElevator][endFloor]++;
                elevatorCounts[closestElevator]++; // 선택된 엘리베이터의 탑승 인원 증가

                System.out.println("현재 탑승 인원 " + count + "명, 시작 층 " + startFloor + "층, 목적지 층 " + endFloor + "층, 무게 " + personWeight);
            } else {
                System.out.println("현재 totalWeight=" + totalWeight);
                break;
            }
        }

        // 나머지 코드는 변하지 않습니다.
    }

    // 가장 가까운 엘리베이터를 찾는 메서드
    private static int findClosestElevator(int startFloor, int[] elevatorPositions) {
        int closestElevator = 0;
        int minDistance = Math.abs(startFloor - elevatorPositions[0]); // 첫 번째 엘리베이터와의 거리로 초기화

        for (int i = 1; i < elevatorPositions.length; i++) {
            int distance = Math.abs(startFloor - elevatorPositions[i]);
            if (distance < minDistance) {
                minDistance = distance;
                closestElevator = i;
            }
        }
        System.out.println("현재 제일 가까운 엘리베이터는" + closestElevator);
        return closestElevator;
    }
}

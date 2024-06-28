package array;

import java.util.Scanner;

public class change_sort {
    public static void main(String[] args){

        System.out.print("한번 움직여보자 우리");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] chage = new int[size];

        for(int i=0; i<chage.length; i++){
            chage[i] = scanner.nextInt();
        } //<-값 넣어주고

        int temp = chage[0];
        for(int i=1; i<chage.length; i++) {  //0번째 값에는 이미 값을 넣었으니깐 1부터 시작한다.
            chage[i-1] = chage[i];
         }
        chage[chage.length-1] = temp;

        for(int i=0;i<chage.length; i++){
            System.out.print(chage[i]+"");
        }

    }
}

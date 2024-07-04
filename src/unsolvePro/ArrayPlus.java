package unsolvePro;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        ;
        int zeroCount = 0;
        while(zeroCount <2){ //2가 될 때 while문 종료한다.
            int input = scanner.nextInt();
            if(input == 0){
                zeroCount++;
            }else{
                zeroCount = 0;
                list.add(input);
            }
        }
        int[] tempArray = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            tempArray[i] = list.get(i);
        }
        for (int i=0; i<list.size(); i++){
            System.out.print(i + "값은?" + tempArray[i] + "     ");
        }
        int[] sum = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            sum[i] = tempArray[i]+tempArray[i+1];
        }



    }
}

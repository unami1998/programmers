package array;

import java.util.Scanner;

public class basic_sort {
    public static void main(String[] args){
        System.out.print("배열 몇 개 할까?");
        Scanner scanner = new Scanner(System.in);
        int[] basic = new int[scanner.nextInt()];

        for(int i=0; i<basic.length; i++){
            basic[i] = scanner.nextInt();   //<-배열의 값을 채워보자
        }

        System.out.println("basic.length하면 뭐가 나올것같아?" + basic.length);
        System.out.println("basic.length하면 뭐가 나올것같아?" + basic[basic.length-1]);
        System.out.println("basic.length하면 뭐가 나올것같아?" + basic[basic.length-2]);

    }
}

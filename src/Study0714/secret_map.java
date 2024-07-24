package Study0714;

public class secret_map {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        //int map[] = new int[5];
        //일단 01001(2)
        String[] binaryNumber1 = new String[n];
        String[] binaryNumber2 = new String[n];

        for (int i = 0; i < binaryNumber1.length; i++) {
            binaryNumber1[i] = Integer.toBinaryString(arr1[i]);
            binaryNumber2[i] = Integer.toBinaryString(arr2[i]);
        }
        int count1 =0;
        for(int i=0; i<binaryNumber1.length; i++) {
            if (binaryNumber1[i].length() < n) {
                count1 = n- binaryNumber1[i].length();  //
                for (int j = 0; j < count1; j++) {
                    binaryNumber1[i] = "0" + binaryNumber1[i];
                }
            }
        }
        int count2 =0;
        for(int i=0; i<binaryNumber2.length; i++) {
            if (binaryNumber2[i].length() < n) {
                count2 = n- binaryNumber2[i].length();  //
                for (int j = 0; j < count2; j++) {
                    binaryNumber2[i] = "0" + binaryNumber2[i];
                }
            }
        }
      //  =======================================================
      //  binaryNumber1[i].charAt(j);  // 0번째 문자열에 있는 0번 문자가 나온다

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {  //String 배열은 +=는 사용할 때 초기화를 해줘야한다
            answer[i] = "";
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { //맞아 그럼 여기선
                if(binaryNumber1[i].charAt(j)=='1' || binaryNumber2[i].charAt(j)=='1'){
                    answer[i] += String.valueOf('#');
                }
                if(binaryNumber1[i].charAt(j)=='0' && binaryNumber2[i].charAt(j)=='0'){
                    answer[i] += String.valueOf(' ');
                }
            }
        }



        return answer;
    }

        public static void main (String[]args){
            int n = 5;
            int[] arr1 = {9, 20, 28, 18, 11};
            int[] arr2 = {30, 1, 21, 17, 28};
            solution(n, arr1, arr2);
        }
    }


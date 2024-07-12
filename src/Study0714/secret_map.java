package Study0714;

public class secret_map {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {"씨발"};

        int[] map = new int[n]; //5개씩 할거임
        //int map[] = new int[5];

        //일단 01001(2)
        System.out.println("출력 얍");

        String[] binaryNumber1 = new String[n];
        String[] binaryNumber2 = new String[n];

        for (int i = 0; i < binaryNumber1.length; i++) {
            binaryNumber1[i] = Integer.toBinaryString(arr1[i]);

        }
        for (int i = 0; i < binaryNumber1.length; i++) {
            System.out.println(arr1[i] + " is " + binaryNumber1[i] + "크기는?" + binaryNumber1.length);
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


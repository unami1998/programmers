package unsolvePro;



public class similarityArray {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
//        for(String checkItem : s1){
//            for(String longItem : s2){
//                if(longItem.equals(checkItem))
//                    answer++;
//            }
//        }
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s2[j].equals(s1[i])) {
                    answer++;
                }
            }
        }

        System.out.print(answer);
        return answer;
    }
    public static void main(String[] args) {
        String [] s1 = {"a","b","c"};
        String [] s2 = {"com", "b", "d", "p", "c"};
        solution(s1, s2);
    }
}

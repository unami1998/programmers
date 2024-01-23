public class Count_of_p_and_y_in_the_string {
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;
            char c = ' ';
            int[] check = new int[2]; //0번 째엔 y값, 1번째엔 p값 담기
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (c == 'p' || c == 'P') check[1]++;
                if (c == 'y' || c == 'Y') check[0]++;
            }
            if (check[1] == check[0])
                return answer;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        String b = "Pyy";
        Solution solutionData = new Solution();
        solutionData.solution(b);

    }
}

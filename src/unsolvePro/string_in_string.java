package unsolvePro;

public class string_in_string {
    public static int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";
        solution(str1, str2);
    }
}

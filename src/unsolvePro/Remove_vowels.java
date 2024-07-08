package unsolvePro;

public class Remove_vowels {
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                answer += ch;
        }
        System.out.print(answer + " ");

        return answer;
    }
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        solution(my_string);
    }
}

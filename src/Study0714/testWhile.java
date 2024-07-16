package Study0714;

public class testWhile {
    public static void main(String[] args) {
        int i=0;
        String answer = "헬로";
        while(i<4){
            answer = "0" + answer;
            i++;
        }
        System.out.print(answer);
    }
}
package level01;

public class plus_minusPlus {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == false){
                absolutes[i] = absolutes[i] - (absolutes[i]*2);
                answer += absolutes[i];
            }else{
                answer += absolutes[i];;
            }
        }
//        for(int i=0; i<absolutes.length; i++){
//
//        }
        System.out.print(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] absolutes ={4,7,12};
        boolean[] signs = {false,false,true};
        solution(absolutes,signs);
    }
}

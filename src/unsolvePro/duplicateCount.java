package unsolvePro;

public class duplicateCount {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] ==n){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int[] array = {0, 2, 3, 4};
        int n = 1;
        solution(array, n);
    }
}

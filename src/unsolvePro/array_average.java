package unsolvePro;

public class array_average {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        answer = answer/numbers.length;
        return answer;
    }
    public static void main(String[] args){
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        solution(numbers);
    }
}

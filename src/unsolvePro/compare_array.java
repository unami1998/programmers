package unsolvePro;

public class compare_array {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length < arr2.length){
            answer = -1;
        }else{
            answer = 1;
        }
        int sum=0;
        int sum_arr2=0;
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                sum += arr1[i];
                sum_arr2 += arr2[i];
            }
            if(sum>sum_arr2){
                answer =1;
            }
            else if(sum<sum_arr2) answer =-1;
            else answer = 0;
        }

        System.out.print(answer);
        return answer;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};
        solution(arr1, arr2);
    }
}

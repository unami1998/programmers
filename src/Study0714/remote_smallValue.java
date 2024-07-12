package Study0714;

public class remote_smallValue {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1]; //어차피 제일 작은거 하나만 제거할거니깐
       // Arrays.sort(arr); <-문제에서 정렬된 형태로 나오면 안되기 때문에

        if (arr.length == 1) {
            return new int[] {-1};
        }
        int min =arr[0]; //그럼 현재 4가 들어가있음
        System.out.print("현재 min->" + min);
        for(int i =0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print("현재 min->" + min);
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                answer[index++] = arr[i];  //이걸 해주지 않으면 i 값이 같이 증가하는데 그러면 min인 경우도 증가해버리기 때문에 얘는 조건에 포함되는 경우일 때만 증가시키기 위해 index를 사용했다
            }
        }
        System.out.println();
        for(int i =1; i<answer.length; i++){
            System.out.print(i  +"번째 " +answer[i] + " ");
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {10};
        solution(arr);
    }
}

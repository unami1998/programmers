import java.util.Arrays;

public class project7 {
    public static void main(String[] args) {
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        Arrays.sort(targets, (o1, o2) -> {
            if (o1[1] == o2[1]) {  //{3,7} o1은 3,o2는 7
                //7을 기준으로한다
                return o1[0] - o2[0];  //3-7= -4다, false
                //o2[0]-o1[0]을 하면 내림차순이 된다
            }
            //targets을 두번째 값을 기준으로 오름차순한다,
            //두번째값이 같을 경우 첫번째값을 분류해서 오름차순으로 하겠다
            return o1[1] - o2[1];
        });
        //첫번째 줄에 있는 두번째값이 나온다 4
        //grid 탐욕꾼, 그당시에 이득보는 놈들
        int answer =0;
        int end = targets[0][1]; //4 이하에 있는 중에서 다 맞겠다
        answer++; //한번 쏴
        //1,4 쐈다 //4 5 쐈다
        //최대값보다 낮은 사람들중에서 이 범위 안에 속해져있다면,

        //4 8  targts[0][1]
        //두번째 인자보다 작은 첫번째 인자가 있다면 포함된다
        //첫번째 인자가 4보다 작으면 속한다
        //1,4
        //4,5
        //4
        //최대값 5
        //3,7 <-최대값보다 작으니 같이 맞는다
        //4,8
        //최대값 5 <-최대값보다 작으니 같이 맞는다
        //5,12    <-최대값같다 == 포함안된다, 쏴야지 쏨으로써 최대값 12로 갱신
        //11,13    <-최대값, 포함되니 안쏜다
        //10,14   <-포함되니 안쏜다


        for(int i=0; i< targets.length; i++){
            for(int j=0;j<targets[i].length; j++){
                System.out.print(targets[i][j]);
            }
            System.out.println();
        }



    }
}

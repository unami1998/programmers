package unsolvePro;

public class ice_Americano {
    public static int[] solution(int money) {

        int ava_count=0;
        int remain_ice=0; //먹을 수 있는 count, 남은 돈

        if(money == 5500){
            ava_count = 1;
        }
        else{
            ava_count = money / 5500;
            remain_ice = money % 5500;
        }
        int[] answer = {ava_count, remain_ice};

        return answer;
    }
    public static void main(String[] args) {
        int money = 5500;
        solution(money);
    }
}

public class Main {
    static class Solution {
        String[] participant;
        String[] completion;
        public Solution(String[] participant, String[] completion){
            this.participant=participant;
            this.completion=completion;
        }
        public String solution(String[] participant, String[] completion) {
            String answer = "hello";

            for (String attend : participant) {  //<-String배열로써도 좋고 memory 측면에서도 좋다
                System.out.println(attend);
            }
            for(String success : completion){
                System.out.print(success);
            }

            for(String maraton:participant){

            }

//            for(int j=0; j<completion.length; j++){  //length가 있어서 위에 for문보다 낫다 List안쓸 땐 그냥 일반적인
                                                        //이런 for문도 괜찮다
//
//            }


            return answer; //success 에는 밥꾸가 없어야한다
        }
    }
    public static void main(String[] args) {
        String[] person = {"leo", "kiki", "eden", "bob"};
        String[] success = {"eden", "kiki"};

        Solution solution = new Solution(person, success);
        solution.solution(person, success);

    }
}
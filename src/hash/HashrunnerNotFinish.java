package hash;

import java.util.HashMap;

public class HashrunnerNotFinish {
    private static String suggestion(String[] participant, String[] completion) {
        HashMap<String, Integer> sum2array = new HashMap();
        String answer = "";

        for(int i=0; i< participant.length; i++) {
            String name = participant[i];
            Integer count = sum2array.get(name);
            if (count == null) {
                sum2array.put(participant[i], 0);
            } else { //count가 있다
                sum2array.put(name, count+1);
            }
        }
        System.out.println("key set은 뭐지" + sum2array.keySet());
        System.out.print("values 들도 뭐지" + sum2array.values());

        for (String complete : completion){
            if(sum2array.containsKey(complete)){
                sum2array.put(complete, sum2array.get(complete)-1); //완주했으니깐 value 1 증가
            }else{
                sum2array.put(complete, sum2array.get(complete));  //완주 못했으니 -1
            }
        }
        for(String key : sum2array.keySet()) {
            if (sum2array.get(key) == 0) {
                answer = key;
            }
        }
//        System.out.println("key set은 뭐지" + sum2array.keySet());
//        System.out.print("values 들도 뭐지" + sum2array.values());

        System.out.println("answer->" + answer);
        return answer;

    }
    public static void main(String[] args) {
        String[] participant ={"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        suggestion(participant, completion);
    }


}

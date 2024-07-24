package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class runnerNotFinish {
    public static String solution(String[] participant, String[] completion){
        //      HashMap<String, String> run = new HashMap<>();
        List<String> noFinish = new ArrayList<>(Arrays.asList(participant));

        for(String finisher : completion){
            noFinish.remove(finisher);
        }
        String answer ="";
        for(int i=0; i< noFinish.size(); i++){
            answer = noFinish.get(i);
        }

        return answer;
    }
    public static void main (String[]args){
        String[] participant ={"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        solution(participant, completion);
    }
}

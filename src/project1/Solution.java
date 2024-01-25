package project1;

public class Solution {
    private String s;

    public Solution(String b) {
        this.s =b;
    }
    public boolean otherSolution2(char... wantChars){
        int[] check = new int[wantChars.length]; //0번 째엔 y값, 1번째엔 p값 담기

        for(int index=0,size=check.length;index<size;index++){
            if(wantChars[index]>'Z') {
                continue;
            }
            else {
                wantChars[index] = (char) (wantChars[index] - ('A' - 'a'));
                System.out.println((int)wantChars[index]);
            }
        }
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            for(int index=0,size=check.length;index<size;index++){
                if(wantChars[index]==c){
                    check[index++]++;
                }
            }
        }

        int value=-1;
        for(int c:check) {
            if (value == -1) {
                value = c;
                continue;
            }
            if (value != c)
                return false;
        }
        return true;
    }
    public boolean otherSolution(char wantFirstChar, char wantSecondChar){
        boolean answer = true;
        int[] check = new int[2]; //0번 째엔 y값, 1번째엔 p값 담기

        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if (c == wantFirstChar) check[1]++;
            if (c == wantSecondChar) check[0]++;
        }

        if (check[1] == check[0])
            return answer;
        else
            return false;
    }
    public boolean solution() {
        boolean answer = true;;
        int[] check = new int[2]; //0번 째엔 y값, 1번째엔 p값 담기

        for(char c : s.toCharArray()){
            if (c == 'e' || c == 'E') check[1]++;
            if (c == 'd' || c == 'H') check[0]++;
        }

        if (check[1] == check[0])
            return answer;
        else
            return false;
    }

}

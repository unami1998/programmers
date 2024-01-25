package project4;

import java.util.Stack;

class Solution{
    public boolean solution(String s) {
        boolean ret = true;//맞는걸 베이스로 간다

        Stack<Character> mystack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                mystack.push('(');
            } else { //  ) 괄호인 경우
                if (mystack.empty()) // 짝이 맞는 경우가 없다,, ( 모양이 없다
                    return false;
                else // ( 있다
                    mystack.pop();// ()
            }
        }
        if(!mystack.empty()) return ret;
        return true;
    }

}
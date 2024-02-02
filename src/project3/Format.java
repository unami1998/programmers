package project3;

//     String splitString[] = phoneNumber.split("/");   <-  / 가 있으면 분리해주겠다

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Format {
    public String input() {
        return "string";
    }

    public String email(String emailCheck) {
        //fpahs927 이면 뒤에 @naver.com 입력하라 하던가
        //아니면 fpahs927@naer.com 처럼 형식 안맞으면 빠꾸

        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(emailCheck);
        if (matcher.matches()) {
            System.out.println("정상적인 이메일");
        } else {
            System.out.println("정상아님");
        }
        return "반갑다";
    }

    public String basicNumber(String phoneNumber) {
        String checkNumber = " ";
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c != '-') {
                checkNumber += c;
            }
        }
        return checkNumber;
    }


    public void phoneCheck(String phoneNumber) {

        String firstNumber = phoneNumber.substring(0, 3); //앞에 3개 쪼갠다
        String secondNumber = phoneNumber.substring(3, 7); //중간에 4개
        String thirdNumber = phoneNumber.substring(7); //뒤에 있는 값들이 다 나와준다

        // String onlyNumber ="";
        if (phoneNumber.contains("-")) {
            basicNumber(phoneNumber);
            System.out.println(basicNumber(phoneNumber));
        }
        //-가 없는 전화번호들
        if ((phoneNumber.length() == 11) || (phoneNumber.length() == 13)) {
            if (firstNumber.equals("010")) System.out.println("제대로 된 전화번호입니다");
            else System.out.println("형식이 틀렸습니다");
        }else System.out.println("전화번호 갯수가 다릅니다 다시 입력해요");
    }
}

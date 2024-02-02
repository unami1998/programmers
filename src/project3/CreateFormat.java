package project3;

public class CreateFormat {
    public static void main(String args[]) {
        //한번 이메일 형식이 아니면 빠꾸
        //전화번호 형식 아니면 빠꾸
//        String inputEmail = "fpahs927@naver.com";
       Format format = new Format();
//        format.email(inputEmail);

        String phoneNumber = "054-2655-0359";
        format.phoneCheck(phoneNumber);

        //전화번호 형식 한번 맞춰보자 010-2655-0359, 숫자는 앞에는 3 뒤에 두 개는 4개. 기준은 -기준으로 3개 쪼개면 되겠다


    }
}

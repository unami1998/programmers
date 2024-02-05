package RandomProject;

import java.util.Random;

public class RandomProject{
    public static void main(String[] args){

        Random rnd = new Random();
        StringBuffer strPwd = new StringBuffer();
        String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i=0; i<5; i++){
            int index = rnd.nextInt(alphaNum.length());
            strPwd.append(alphaNum.charAt(index));
        }
        System.out.println(strPwd.toString());
    }
}

package splitString;


public class main {
    public static String splitString(String Testsplit){
        char[] char_array = new char[Testsplit.length()];
        String temp ="";

        boolean flag = false;    //%가 나오는 상황일 땐 true가 나오게 한다.
        for(int i= 0; i<=char_array.length-1; i++){
            char_array[i] = Testsplit.charAt(i);

            if(char_array[i] == '%'){
                flag = true; //그리고 true일 때 집어넣어야하댕
            }
            else if(char_array[i] == '&'){
                flag = false;
            }
            if(flag && char_array[i] != '%' && char_array[i] != '&'){
                temp += char_array[i];
            }
        }
        return temp;
    }
    public static void main(String[] args){
        System.out.println(splitString("HELLO%WORLD&CHIWAWA%DOG"));
    }

}


package splitString;


public class main {
    public static String splitString(String Testsplit){

        char[] char_array = new char[Testsplit.length()];
        String[] temp = new String[2];

        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
        for(int i= 0; i<=char_array.length-1; i++){
            char_array[i] = Testsplit.charAt(i);
            if(char_array[i] == '%'){
                part1.append(char_array[i]);
            }
        }
        temp[0] = part1.toString(); 
        return Testsplit;
    }
    public static void main(String[] args){
        System.out.println(splitString("HELLO%WORLD&"));
    }

}

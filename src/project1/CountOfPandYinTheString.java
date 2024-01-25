package project1;


public class CountOfPandYinTheString {

//프로그래머스 문자열 내 p와 y의 개수
    public static void main(String[] args) {
      String b = "zPyykkfdfsfqecPPPPPhhz";


      Solution solutionData = new Solution(b);

      boolean result= solutionData.otherSolution2('k','h','Z');

      System.out.println(result);
    }
}



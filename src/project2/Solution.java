package project2;

   class Solution {
        public int[] solution(String s) {
            //
            // 2진법 비트연산자 사용해봄, 10진법을 2진법으로 바꾸고 그 값을 또 비트연사자를 이용해 10진법을 바꿈

//            int[] answer = {0,0};
//
//            while(!s.equals("1")){
//                int originLen = s.length();
//                s = s.replaceAll("0", "");
//
//                answer[0]++;   //과정을 반복할 때마다 증가
//                // 111 -> 11 -> 1
//                answer[1] += (originLen - s.length());
//                //없어진 0의 갯수들 기존에 선언된 길이에서 0이 대체된 숫자만큼 크기 증가
//                s = Integer.toBinaryString(s.length());
//            }
//
//            return answer;
///////////////////////////////////////////////////////////////////////////////////////////////


            int oneCount = 0;
            char a = ' ';
            int spinCount=0;
            int zeroCount=0;

            while (!s.equals("1")) {
                oneCount =0;

                for(char testChar:s.toCharArray()){
                    if(testChar == '1') oneCount++;
                    else zeroCount++;
                }
//                for (int i = 0; i < s.length(); i++) {
//                    a = s.charAt(i);
//                    if (a == '1') {
//                        oneCount++;  //그럼 1이 세 개 나오겠지?
//                    }else{
//                        zeroCount++;
//                    }
//                }
                System.out.println("count와와" + oneCount);

                //count를 2진법으로 바꾸는게 필요하다
                int tempCount = oneCount;
                String tempDog = "";
                while (tempCount != 0) { //1이 하나 남을 때까지 반복해라
                    tempDog = Integer.toString(tempCount % 2) + tempDog;  //나머지만 넣어준거야
                    tempCount /= 2;

                }
                s = tempDog;
                System.out.println("댕댕이" + s);
                spinCount++;
            }
            return new int[]{spinCount,zeroCount};
            ////////////////////////////////////////////////////////////////////////////////////

//밑에는 내가 2진법 해보고싶어서 한거다 신경쓰지마라


//            int count = 0;
//            char a = ' ';
//
//            for (int i = 0; i < s.length(); i++) {
//                a = s.charAt(i);
//                if (a == '1') {
//                    count++;  //그럼 1이 세 개 나오겠지?
//                }
//            }
//
//
//                int[] number = new int[count];  //0제거 후 길이 이제 이걸 2진법으로 바꿔라
//                int position =0;
//                System.out.print("0제거 후 길이->" + count);
//                //몫이 0이 될 시 반복 끝낸다
//                do {
//                    number[position] = count % 2;
//                    count = count / 2;      //2로 나눈 몫을 저장
//                    position++;
//                } while (count != 0);
//
//                System.out.println("3이 2진법이 된 값이 나와야한다");
//                for (int i = position - 1; i >= 0; i--) {
//                    System.out.print(number[i]);
//                }
//
//                for (int i = 0; i < number.length; i++) {
//                    if (number[i] == 1) {
//                        count++;
//                    }
//                }
//                System.out.print("\n 2가 나와야한다" + count);
            //count를 또 2진법으로 변환해야한다

            //그럼 이 count값, 10진법을 2진법으로 변환해라.
//
//
//
//            for (int j : number) {
//                number[j] = 1;
//            }        ///111이 나온다
//
//            System.out.print("2씩 거듭제곱->");
//            int newCount = 0;
//            for (int i = 0; i<number.length; i++) {
//                number[i] = 1<<i;   // <-1 1 1 을 -> 1 2 4 2진법으로
//                System.out.print(number[i] + " ");
//                newCount += number[i];
//            }
//
//            System.out.println("newCount값->" + newCount);  //7이 나오고,
//
//            //2^4 =
//            System.out.print("10진법이 된 newCount값->");
//            int[] finishNumber = new int[newCount];
//
//            for (int b = 4; b >= 0; b--) {
//                if ((newCount >> b & 1) ==1) {
//                    System.out.print(1);
//                    finishNumber[b] = 1;
//                }
//            }
//            //////////////////여기서 막히니 해라
//            System.out.print("\n이게 다시 10진법 ->");
//            for (int i = 0; i<number.length; i++) {
//              System.out.print(finishNumber[i]);
//            }
        }
    }

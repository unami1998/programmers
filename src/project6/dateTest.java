package project6;

import project6.Test;

public class dateTest {
    public static void main(String[] args){

        String dataTime = "2024-11-03";
        String termcode="0x02";

        Test test=new Test();

        test.initData();

        Test.ResultDTO resultDTO=  test.function(dataTime,termcode);

        System.out.println(resultDTO.resultContents+" -> "+resultDTO.resultDateTime);


    }
}

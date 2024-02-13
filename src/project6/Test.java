package project6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {
    ArrayList<String[]> list = new ArrayList<String[]>();

    public void initData() {

        list.add(new String[]{"02-05","-01","0x01"});
        list.add(new String[]{"01-03","-02","0x01"});
        list.add(new String[]{"10-05","-03a","0x01"});
        list.add(new String[]{"10-03","-03b","0x02"});
        list.add(new String[]{"10-02","-03c","0x03"});
        list.add(new String[]{"10-01","-03d","0x04"});


    }

    static public  class  ResultDTO{

        String resultContents;

        String resultDateTime;
        public ResultDTO(String resultContents, String resultDateTime) {
            this.resultContents=resultContents;
            this.resultDateTime=resultDateTime;

        }
    }
    public ResultDTO function(String dataTime, String termcode) {
        String resultContents="null";
        String resultDateTime="null";
        try{

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date currentDate = dateFormat.parse(dataTime);


            System.out.println(currentDate);

            for (int i = 0; i < list.size(); i++) {

                if(!list.get(i)[2].equals(termcode))
                    continue;
                String dateString = "2024-" + list.get(i)[0];
                Date post = dateFormat.parse(dateString);


                if (post.before(currentDate)) {
                    System.out.println(dateString + " is before " + dataTime);
                    resultDateTime = dateString;
                    resultContents = list.get(i)[1];

                } else if (post.after(currentDate)) {
                    System.out.println(dateString + " is after " + dataTime);
                } else {
                    System.out.println(dateString + " is equal to " + dataTime);
                }
            }
        }

        catch (Exception e){
            e.printStackTrace();

        }

        return new ResultDTO(resultContents,resultDateTime);

    }
}

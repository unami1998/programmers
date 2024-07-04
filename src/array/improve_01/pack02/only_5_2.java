package array.improve_01.pack02;

import java.util.ArrayList;

public class only_5_2 {

    public static int[] solution(int l, int r) {
        //5만 나오게 일단 해보자

        TestParamters paramters= new TestParamters().to(l,r);
        FilterRules rules=new FilterRules();
        rules.addRule(7);
        rules.addRule(3);
        rules.addRule(2);
        rules.setFilter(new FilterRules.Filter(){

            @Override
            public boolean onFilter(FilterRules rules, int number) {
                String str = String.valueOf(number);  //str을 위한 반복문이 필요하다

                int temp;
                for (int j = 0; j < str.length(); j++) {
                    temp=str.charAt(j)-'0';
                    if (!rules.containsOr(temp)) {
                        return false;
                    }
                }
                return true;
            }
        });
        int[] result= MainProgram.filterFromParameters(paramters,rules);
        paramters.clear();
        rules.clear();


        System.out.println("ListAnswer===="+result.length);
        int index=0;
        for (int _r:result)
            System.out.println("ListAnswer["+(index++)+"]" + _r);
        return result;
    }

    public static void main(String[] args) {
        int l = 5, r = 555;
        solution(l, r);

    }
    public static class  MainProgram{

        public static int[] filterFromParameters(TestParamters paramters, FilterRules rules) {
            ArrayList<Integer> result = new ArrayList<>();

            ArrayList<Integer> _source =  paramters.parameters;
            boolean flag = true;


            for (int current: _source) {    // <-l~r 까지의 범위만큼 하나씩 가져온다
                if (rules.onFilter(current)) {
                    result.add(current);
                }
            }


            if (result.isEmpty()) {
                System.out.print("-1");
                return new int[]{-1};
            }
            int[] answer = new int[result.size()];
            for (int j = 0; j < result.size(); j++) {
                answer[j] = result.get(j);
            }
            result.clear();
            return answer;
        }
    }
    public static class  FilterRules{
        private ArrayList<Integer> rules=new ArrayList<>(0);
        private FilterRules.Filter filter;


        public void clear() {
            rules.clear();
        }

        public boolean containsOr(int thisNumber) {
            for (int index=0;index<rules.size();index++){
                if(rules.get(index).intValue()==thisNumber){
                    return true;
                }
            }
            return false;
        }

        public boolean onFilter(int current) {
            if(filter==null)
                return true;
            if(filter.onFilter(this, current))
                return true;
            return false;
        }

        public interface Filter{
           boolean onFilter(FilterRules rules, int number);
        }
        public void addRule(int number) {
            if(rules.contains(number))
                return;
            rules.add(number);
        }

        public void setFilter(FilterRules.Filter filter) {
            this.filter=filter;
        }
    }
    public static class TestParamters{
        private ArrayList<Integer> parameters=new ArrayList<>(0);
        public TestParamters to(int parameter1, int parameter2) {
            while (parameter1<parameter2){
                parameters.add(parameter1++);
            }
            return this;
        }

        public void clear() {
            parameters.clear();
        }
    }
}

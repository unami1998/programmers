package inerfaceTest;

public class Test {
    public static void main(String[] args){
        SayTest  sayTest = new SayTest() {
            @Override
            public void sayHello() {
                System.out.print("hello world");
            }

            @Override
            public void withDraw(int price) {
                if(SayTest.MAX>price){
                    System.out.print("여기서 기능구현" + price);
                }else{
                    System.out.print("여기선 기능구현이 안돼" + price);
                }
            }

        };
        sayTest.sayHello();
    }
}

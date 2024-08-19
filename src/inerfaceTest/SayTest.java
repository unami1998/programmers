package inerfaceTest;

public interface SayTest {
    void sayHello();

    public int MAX=100;
    void withDraw(int price);
    default String findAccount(String userId){
        System.out.print("TEST");
        return "how result";
    }
}

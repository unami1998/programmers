package Synchronized;

// synchronized 키워드를 사용하여 메소드에 동기화 적용
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    // volatile private int count = 0; // 공유 자원
    // AtomicInteger count = new AtomicInteger(0);

    public int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}

public class CounterTest extends Thread {
    private Counter counter; // 스레드가 공유하는 카운터 인스턴스

    public CounterTest(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        CounterTest thread1 = new CounterTest(counter);
        CounterTest thread2 = new CounterTest(counter);
        // 스레드 시작
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.count);
    }
}


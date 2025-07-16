class Counter {
    static int count = 0;

    void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.increment();
        System.out.println("count = " + Counter.count);

        c2.increment();
        System.out.println("count = " + Counter.count);

        c3.increment();
        System.out.println("count = " + Counter.count);
    }
}

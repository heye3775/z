class Example {
    static int staticVar = 0;
    int nonStaticVar = 0;

    void increment() {
        staticVar++;
        nonStaticVar++;
    }

    void display(String objName) {
        System.out.println(objName + " -> staticVar: " + staticVar + ", nonStaticVar: " + nonStaticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment();
        obj1.display("obj1");
        obj2.display("obj2");

        obj2.increment();
        obj1.display("obj1");
        obj2.display("obj2");
    }
}

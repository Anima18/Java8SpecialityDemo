package lambda;

/**
 * Created by Admin on 2017/6/21.
 */
interface Hello {
    void sayHello(String name);
}

public class Test {
    private Hello hi;

    public Test(Hello hi) {
        this.hi = hi;
    }

    public void call(String name) {
        hi.sayHello(name);
    }

    public static void main(String[] args) {
        new Test((name) -> System.out.println("hello, "+ name)).call("Chris");
    }
}

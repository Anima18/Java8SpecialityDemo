package defaultmothed;

/**
 * Created by Admin on 2017/6/21.
 */

interface Hello {
    default void sayHello() {
        System.out.println("hello world");
    }
}

public class Test implements Hello {
    public static void main(String[] args) {
        Test t = new Test();
        t.sayHello();
    }
}

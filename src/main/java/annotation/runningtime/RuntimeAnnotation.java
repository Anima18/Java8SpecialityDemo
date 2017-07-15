package annotation.runningtime;

/**
 * Created by Admin on 2017/7/8.
 */
@ClassInfo("RuntimeAnnotation")
public class RuntimeAnnotation {
    @FieldInfo({1,2})
    public String fieldName;

    @FieldInfo({10086})
    public int i;

    @MethodInfo(name = "简建鸿", data = "2017-7-8")
    public void sayHello() {
        System.out.println("hello world");
    }
}

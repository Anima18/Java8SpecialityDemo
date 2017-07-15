package stream;

/**
 * Created by Admin on 2017/6/24.
 */
public class Adult {
    private String name;
    private int age;

    public Adult(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

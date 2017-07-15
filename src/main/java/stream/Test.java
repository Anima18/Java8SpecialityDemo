package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by Admin on 2017/6/24.
 */
public class Test {

    public List<Person> initData() {
        List<Person> datas = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            datas.add(new Person("Chris", i));
        }
        return datas;
    }

    public void print(List datas) {
        System.out.println(datas);
    }

    public static void main(String[] agrs) {
        Test test = new Test();
        List<Person> datas = test.initData();

        //内部循环
        datas.forEach(p->p.setName("Anima"));

        test.print(datas);

        //Stream API
        List adultList = datas.stream().filter(p->p.getAge() > 18).map(new Function<Person, Object>() {
            @Override
            public Object apply(Person person) {
                return new Adult(person);
            }
        }).collect(Collectors.toList());

        test.print(adultList);

    }

}

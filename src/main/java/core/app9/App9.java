package core.app9;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App9 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App9.class, args);
        Comp1 b1 = context.getBean(Comp1.class);
        Comp2 b2 = context.getBean(Comp2.class);

        System.out.println(b1.getComp2() == b2); // true
    }
}

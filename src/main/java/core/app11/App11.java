package core.app11;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App11 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App11.class, args);
        Comp1 b1 = context.getBean(Comp1.class);
        Comp2 b2 = context.getBean(Comp2.class);

        Comp2 o = b1.getComp2();
        System.out.println("o = " + o); // not null
        System.out.println(o == b2); // true
    }
}

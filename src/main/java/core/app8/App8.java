package core.app8;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App8 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App8.class, args);
        Component1 b1 = context.getBean(Component1.class);
        Component2 b2 = context.getBean(Component2.class);

        Component2 o = b1.getComponent2();

        System.out.println(b2 == o); // true
    }
}

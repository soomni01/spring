package core.app7;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App7 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App7.class, args);

        Bean1 b1 = context.getBean(Bean1.class);
        Bean2 b2 = context.getBean(Bean2.class);

        Bean2 o = b1.getBean2();

        System.out.println(b2 == o);
    }
}

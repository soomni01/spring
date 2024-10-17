package core.app9;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App9 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App9.class, args);
        Com1 b1 = context.getBean(Com1.class);
        Com2 b2 = context.getBean(Com2.class);

        System.out.println(b1.getCom2() == b2); // true
    }
}

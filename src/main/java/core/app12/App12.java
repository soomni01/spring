package core.app12;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App12 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App12.class, args);
        Bean1 b1 = context.getBean(Bean1.class);
        Bean2 b2 = context.getBean(Bean2.class);

        System.out.println(b1.getBean2()); // not null
        System.out.println(b1.getBean2() == b2); // true
    }
}

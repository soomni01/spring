package core.app6;

import core.app6.controller.Controller1;
import core.app6.controller.Controller2;
import core.app6.service.Service1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class
App6 {
    public static void main(String[] args) {
        BeanFactory factory = SpringApplication.run(App6.class, args);
        Controller1 b1 = factory.getBean(Controller1.class);
        Controller2 b2 = factory.getBean(Controller2.class);
        Service1 s1 = factory.getBean(Service1.class);

        Service1 d1 = b1.getService1();
        Service1 d2 = b2.getService1();

        System.out.println("d1 = " + d1); // 같은 내용
        System.out.println("d2 = " + d2); // 같은 내용
    }
}

package core.app3;

import core.app3.service.Service1;
import core.app3.service.Service2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App3 {
    public static void main(String[] args) {
        BeanFactory factory = SpringApplication.run(App3.class, args);
        Service1 b1 = factory.getBean(Service1.class); // 객체로 꺼내오는 것
        Service2 b2 = factory.getBean(Service2.class);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // Bean 으로 생성된 객체는 클래스 이름(lower)으로 가져올 수 있음
        Object b3 = factory.getBean("service1"); // 이름으로 꺼내오는 것
        System.out.println("b3 = " + b3);

        Object b4 = factory.getBean("service2");
        System.out.println("b4 = " + b4);

        Object b5 = factory.getBean("service111");
        System.out.println("b5 = " + b5);
    }
}

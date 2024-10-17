package core.app6.controller;

import core.app6.service.Service1;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Controller1 {
    Service1 service1;

    @Autowired
    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    public void method() {
        service1.method();
    }
}

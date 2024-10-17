package core.app9;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Comp1 {

    private Comp2 comp2;

    public Comp1() {
    }

    // 생성자 주입
    @Autowired // 생성자가 하나일 때 생략 가능
    public Comp1(Comp2 comp2) {
        this.comp2 = comp2;
    }
}

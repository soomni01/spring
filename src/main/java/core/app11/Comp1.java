package core.app11;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class Comp1 {
    final Comp2 comp2;


//    public Comp1(Comp2 comp2) {
//        this.comp2 = comp2;
//    }
}

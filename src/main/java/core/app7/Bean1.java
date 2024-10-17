package core.app7;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Bean1 {

    @Autowired
    Bean2 bean2;
}

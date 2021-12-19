package Task3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface AnotThree {
}

@AnotThree
public class ClassThree extends ClassTwo {
    @Deprecated
    private int number;
}

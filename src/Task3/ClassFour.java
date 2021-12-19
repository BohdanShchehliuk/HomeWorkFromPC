package Task3;

import jdk.jfr.Label;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface AnotFour {
}

@AnotFour
public class ClassFour extends ClassThree {
    @Label("sdd")
    private int number;
}

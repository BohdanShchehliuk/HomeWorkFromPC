package Task3;

import jdk.jfr.Description;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface AnotTwo {
}

@AnotTwo
public class ClassTwo extends ClassOne {
    @Description("la la la la")
    private int number;
}

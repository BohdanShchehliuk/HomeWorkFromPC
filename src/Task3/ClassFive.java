package Task3;

import jdk.jfr.Experimental;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AnotFive {
}

@AnotFive
public class ClassFive extends ClassFour {

    @Experimental
    private int number;
}

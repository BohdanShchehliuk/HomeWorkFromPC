package Task3;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Class classFiveClass = ClassFive.class;
        Annotation[] annotationFive = classFiveClass.getAnnotations();
        System.out.println(Arrays.toString(annotationFive));

        Class classFourClass = ClassFour.class;
        Annotation[] annotation4 = classFourClass.getAnnotations();
        System.out.println(Arrays.toString(annotation4));

        Class classThreeClass = ClassThree.class;
        Annotation[] annotation3 = classThreeClass.getAnnotations();
        System.out.println(Arrays.toString(annotation3));

        Class class2 = ClassTwo.class;
        Annotation[] annotation2 = class2.getAnnotations();
        System.out.println(Arrays.toString(annotation2));

        Class class1 = ClassOne.class;
        Annotation[] annotation1 = class1.getAnnotations();
        System.out.println(Arrays.toString(annotation1));
    }
}

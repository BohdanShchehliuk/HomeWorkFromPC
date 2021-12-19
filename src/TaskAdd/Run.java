package TaskAdd;

import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        Add obj = new Add();
        Method[] method = Add.class.getDeclaredMethods();
        for (Method tm : method) {
            MyAnnotation myAnnotations = tm.getAnnotation(MyAnnotation.class);
            firstNum = myAnnotations.firstNumb();
            secondNum = myAnnotations.secondNumb();
            System.out.println("For method: result = " + obj.add(firstNum, secondNum));
        }
        AnotationForClass anotationForClass = Add.class.getAnnotation(AnotationForClass.class);
        System.out.println("For class: result = " +
                obj.add(anotationForClass.first(), anotationForClass.second()));
    }
}

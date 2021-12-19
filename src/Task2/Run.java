package Task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        Class cl = Numbers.class;
        List list = new ArrayList();
        Field[] feild = cl.getDeclaredFields();
        System.out.println(Arrays.toString(feild));
        for (Field tm : feild) {
            if (tm.isAnnotationPresent(Anotation.class)) {
                list.add(tm.getName());
            }
        }
        System.out.println("You can choose numbers only from this list: " + list);
        Numbers numbers = new Numbers();
        Calculator calculator = new Calculator(numbers.numberOne, numbers.numberThree);
        System.out.println("First number + Second number is: " + calculator.add());
        System.out.println("First number - Second number is: " + calculator.min());
        System.out.println("First number * Second number is: " + calculator.multipl());
        System.out.println("First number : Second number is: " + calculator.div());
    }
}
//Згенервано інформацію про проект:
// file:///C:/Users/User/Desktop/java/Java%20Professional%20Student1/006_Annotations/Task2/Calculator.html
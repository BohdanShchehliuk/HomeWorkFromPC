package TaskAdd;

@AnotationForClass(first = 10, second = 22)
public class Add {
    @MyAnnotation(firstNumb = 2, secondNumb = 3)
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

package Task2;

public class Calculator {
    private int firstNumb;
    private int secondNumb;

    public Calculator(int firstNumb, int secondNumb) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
    }

    public int add() {
        return firstNumb + secondNumb;
    }

    public int min() {
        return firstNumb - secondNumb;
    }

    public int multipl() {
        return firstNumb * secondNumb;
    }

    public int div() throws ArithmeticException {
        try {
            int a = firstNumb / secondNumb;

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Chande second number. Cod is:");
            return -111111111;
        }
        return firstNumb / secondNumb;
    }
}

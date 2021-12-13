package Tasks;

public class StringSplit {
    public static void main(String[] args) {
        String line = new String("Java (вимовляється Джава[4]) — об'єктно-орієнтована " +
                "мова програмування, випущена 1995 року компанією «Sun Microsystems» як " +
                "основний компонент платформи Java. З 2009 року мовою займається компанія " +
                "«Oracle», яка того року придбала «Sun Microsystems». В офіційній реалізації " +
                "Java-програми компілюються у байт-код, " +
                "який при виконанні інтерпретується віртуальною машиною для " +
                "конкретної платформи.");

        System.out.println(line.substring(0, line.length() / 2));
        System.out.println(line.substring(line.length() / 2, line.length()));
    }
}

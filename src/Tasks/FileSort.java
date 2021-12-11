package Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FileSort {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\User" +
                "\\Desktop\\java\\java-starter-materials\\" +
                "001_Intro\\HomeWorkFromPC\\src\\Task2\\File1.txt");
        file1.createNewFile();
        FileWriter fileWriter = new FileWriter(file1);
        for (int i = 0; i < 10; i++) {
            fileWriter.write("" + (int) (Math.random() * 100) + " ");
        }
        fileWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        String line = bufferedReader.readLine();
        System.out.println(line);
        ArrayList<Integer> integer = new ArrayList<>();
        for (String tmp : line.split(" ")) {
            integer.add(Integer.parseInt(tmp));
        }
        integer.sort(Comparator.naturalOrder());
        System.out.println(integer.toString());
    }
}

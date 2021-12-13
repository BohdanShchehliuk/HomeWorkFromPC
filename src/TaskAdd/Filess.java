package TaskAdd;

import java.io.*;

public class Filess {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\java" +
                "\\java-starter-materials\\001_Intro\\HomeWorkFromPC\\src\\TaskAdd\\FillAdd"));
        String line = bf.readLine();
        bf.close();
        System.out.println(line);
    }
}

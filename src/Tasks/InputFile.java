package Tasks;

import java.io.*;

public class InputFile {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("File.txt");
            file.createNewFile();
            System.out.println("You created file: " + file.getName());
            FileWriter fileWriter = new FileWriter(file.getName());
            fileWriter.write("Hello world!");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            System.out.println(line);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(line);
            String lineNew = new String(stringBuffer.reverse());
            FileWriter fileWriter1 = new FileWriter(file.getName());
            fileWriter1.write(lineNew);
            fileWriter1.close();
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file));
            String line2 = bufferedReader1.readLine();
            System.out.println(line2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

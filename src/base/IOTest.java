package base;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("d:/aa.txt");
            fw.write("hello world");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

package Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {

        File file = new File("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo\\file.txt");

        try (FileReader fr = new FileReader(file)){
            int i = 0;
            while ( (i = fr.read()) != -1){
                System.out.print((char) i);
            }




            //            System.out.println(fr.read());
//            char[] in = new char[30];
//            for (char c : in) {
//                System.out.println(c);
//            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

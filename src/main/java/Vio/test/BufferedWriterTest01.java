package Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo\\file.txt");

        {
            try( FileWriter fw = new FileWriter(file, true);
                 BufferedWriter bw = new BufferedWriter(fw)
            ) {
                bw.write("Teste");
                bw.newLine();
                bw.write("Nova linha");
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }

}

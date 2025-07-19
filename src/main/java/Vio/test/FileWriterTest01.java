package Vio.test;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo\\file.txt");

        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Teste escrevendo o texto dentro de um arquivo criado. \n Continua na proxima linha, n suportado em todos os sistemas operacionaiss \n");

            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

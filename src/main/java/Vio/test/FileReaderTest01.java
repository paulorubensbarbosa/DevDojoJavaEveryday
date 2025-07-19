package Vio.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {

        File file = new File("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo\\file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Teste de texto \n próxima linha");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileReader fr = new FileReader(file)){
            int i = 0;
            while ( (i = fr.read()) != -1){
                System.out.print((char)i);
            }


//            char[] in = new char[1000];
//            int size = fr.read(in);
//            System.out.println(size);
//            for (char c : in) {
//                System.out.print(c);
//            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();

        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");

        try {
            System.out.println(fileArquivoDiretorio.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("DiretorioRenamed");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);


    }
}

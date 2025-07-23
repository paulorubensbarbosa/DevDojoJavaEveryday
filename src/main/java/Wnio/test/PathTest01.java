package Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo_renomeado.txt");
        Path path2 = Paths.get("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled","arquivo_renomeado.txt");
        Path path3 = Paths.get("D","WorkSpace\\Curso-DevDojo-Java\\untitled", "arquivo_renomeado.txt");
        Path path4 = Paths.get("D", "WorkSpace", "Curso-DevDojo-Javauntitled", "arquivo_renomeado.txt");

        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());
        System.out.println(path3.getFileName());
        System.out.println(path4.getFileName());

    }
}

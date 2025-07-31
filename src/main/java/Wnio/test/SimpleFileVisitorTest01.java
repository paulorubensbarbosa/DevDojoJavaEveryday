package Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//Configuração para retornar todos os arquivos com o final .Java
class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");

        //só teste para saber a data da última alteração da pasta
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        //System.out.println((basicFileAttributes.creationTime()).toInstant());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd / MMMM / yyyy");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(basicFileAttributes.creationTime().toInstant(), ZoneId.systemDefault());

        System.out.println(localDateTime.format(dateTimeFormatter));

        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListAllFiles());

    }
}

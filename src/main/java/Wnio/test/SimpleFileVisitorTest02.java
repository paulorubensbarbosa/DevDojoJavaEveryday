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

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}


public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");

        //só teste para saber a data da última alteração da pasta
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        //System.out.println((basicFileAttributes.creationTime()).toInstant());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd / MMMM / yyyy");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(basicFileAttributes.creationTime().toInstant(), ZoneId.systemDefault());

        System.out.println(localDateTime.format(dateTimeFormatter));

        Path root = Paths.get("pasta");

        Files.walkFileTree(root, new ListAllFiles());

    }
}

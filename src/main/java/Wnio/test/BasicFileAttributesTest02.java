package Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation Time:  " + creationTime);
        System.out.println("Last Access Time: " + lastAccessTime);
        System.out.println("Last Modified Time: " + lastModifiedTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MM / yyyy");

        LocalDateTime ldt = LocalDateTime.ofInstant(basicFileAttributes.creationTime().toInstant(), ZoneId.systemDefault());
        System.out.println(ldt.format(dtf));
        System.out.println(LocalDateTime.now());

        System.out.println("------------------------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime , creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("Creation Time:  " + creationTime);
        System.out.println("Last Access Time: " + lastAccessTime);
        System.out.println("Last Modified Time: " + lastModifiedTime);
        

    }
}

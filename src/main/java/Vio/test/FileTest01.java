package Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\WorkSpace\\Curso-DevDojo-Java\\untitled\\arquivo\\file.txt");
        try {
            boolean isDeleted = file.delete();
            System.out.println("Deleted: " + isDeleted);
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            //saber quanto foi modificado
            System.out.println( Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate() );



            boolean exists = file.exists();

            if(exists){
                System.out.println("Deleted: " + file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

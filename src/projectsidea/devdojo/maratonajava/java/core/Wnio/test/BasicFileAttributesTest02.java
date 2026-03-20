package projectsidea.devdojo.maratonajava.java.core.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        Path path2 = Paths.get("pasta2/novo_path2.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        BasicFileAttributes basicFileAttributes2 = Files.readAttributes(path2, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime creationTime2 = basicFileAttributes2.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        int i = creationTime2.compareTo(creationTime);
        System.out.println(i);

        System.out.println("creationTime +" + creationTime);
        System.out.println("lastModifiedTime +" + lastModifiedTime);
        System.out.println("lastAccessTime +" + lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

       // creationTime.compareTo()

    }
}

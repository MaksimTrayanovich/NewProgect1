package by.tut.Lesson12;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.doc");
        File file2 = new File("out2");
        String str = "hello\t \nworld";
        System.out.println(str);
        System.out.println("file is real? - " + file.exists());
        System.out.println("it is file? - " + file.isFile());
        System.out.println("it is directory? - " + file.isDirectory());
        file2.mkdir();
        System.out.println("hidden file? - " + file.isHidden());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
//        System.out.println(new File(file.getParent()).getParent());
        File file3 = new File("C:\\Users\\mtray\\IdeaProjects\\NewProgect1");
        System.out.println(Arrays.toString(file3.listFiles(new DocFilter())));
        System.out.println("1 " + file.canRead());
//        System.out.println("2 " + file.canExecute());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.renameTo(new File("abc2.doc")));
        System.out.println(file.setReadOnly());
        System.out.println(file.setReadable(true));
        System.out.println(file.setWritable(false));
        System.out.println(file.lastModified());
        System.out.println("3 " + file.canWrite());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println("File is not created by some reason: " + e);
        }
//        System.out.println(file.delete());
    }
}

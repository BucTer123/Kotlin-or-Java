import java.io.File;
import java.io.FileWriter;
import java.io.IOExpection;
import java.util.Scanner;

public class mkdirclassname {
    public static void mkdirfuncname() throws IOExpection {
        System.out.println("Write name dir to create :");

        Scanner sc = new Scanner(System.in);

        String mk = sc.NextLine();

        Files.createDirectory(mk);
        System.out.println("Created! :" + mk);
    }
}
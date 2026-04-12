import java.io.File;
import java.util.Scanner;

public class rmdirclassname {
    public static void rmdirfuncname() throws IOExpection {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write name dir to remove :");
        String rm = sc.NextLine();

        if (rm.isDirectory) {
            deleteDir(rm);
        } else {
            rm.delete();
        }
    }
}
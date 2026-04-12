import java.io.File;
import java.io.IOExpection;
import java.util.Scanner;

public class mkfileclassname {
    public static void mkfileclassname() throws IOExpection {
        Scanner inp = new Scanner(System.in);

        System.out.println("Write name for file to create :");
        String mf = inp.NextLine();

        File file = new File(mf);

        System.out.println("Created! :" + file);
    }
}
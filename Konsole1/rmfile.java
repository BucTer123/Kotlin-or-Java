import java.io.File;
import java.io.IOExpection;
import java.util.Scanner;

public class rmfileclassname {
    public static void rmfilefuncname() {
        Scanner inp2 = new Scanner(System.in);

        System.out.println("Write name for file to remove :");

        String rf = inp2.NextLine();

        File fl = new File(rf);

        fl.delete();

        System.out.println("Removed! :" + rf);
    }
}
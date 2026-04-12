import java.io.IOExpection;
import java.util.List;
import java.util.Scanner;

public class openfilenameclassname {
    public static void openfilenamefuncname() {
        Scanner inp3 = new Scanner(System.in);

        System.out.println("Write name for file to open :");
        String opn = inp3.NextLine();

        List<String> lines = Files.readAllFiles(opn);
        System.out.println(lines);
    }
}
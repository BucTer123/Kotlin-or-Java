import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOExpection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome!\n");

            Scanner sc = new Scanner(System.in);

            System.out.println("> ");

            String c = sc.NextLine();

            if (c == "help") {
                System.out.println("List of commands :\n");
                System.out.println("1 => help\n");
                System.out.println("2 => math\n");
                System.out.println("3 => exit\n");
                System.out.println("4 => mkdir\n");
                System.out.println("5 => rmdir\n");
                System.out.println("6 => mkfile\n");
                System.out.println("7 => rmfile\n");
                System.out.println("8 => open_filename\n");
                System.out.println("9 => ListDirAFile\n");
                System.out.println("10 => TimeNow\n");
                System.out.println("11 => DateTime\n");
                System.out.println("12 => TimeDateNow\n");
            }
            else if (c == "math") {
                mathclassname.mathfuncname();
            }
            else if (c == "exit") {
                exit(0);
            }
            else if (c == "mkdir") {
                mkdirclassname.mkdirfuncname();
            }
            else if (c == "rmdir") {
                rmdirclassname.rmdirfuncname();
            }
            else if (c == "mkfile") {
                mkfileclassname.mkfilefuncname();
            }
            else if (c == "rmfile") {
                rmfileclassname.rmfilefuncname();
            }
            else if (c == "open_filename") {
                openfilenameclassname.openfilenamefuncname();
            }
            else if (c == "ListDirAFile") {
                listdirafileclassname.listdirafilefuncname();
            }
            else if (c == "TimeNow") {
                timenowclassname.timenowfuncname();
            }
            else if (c == "DateTime") {
                datetimeclassname.datetimefuncname();
            }
            else if (c == "TimeDateNow") {
                timedatenowclassname.timedatenowfuncname();
            }
        }
    }
}
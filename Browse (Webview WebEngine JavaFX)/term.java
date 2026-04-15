import java.util.Scanner;

public class main {
    public static void main() {
        System.out.println("Welcome!\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to start ui? (y/n):");
        String line = sc.NextLine();

        if (line == "y" && line == "Y") {
            secondmainclassname.secondnotmain();
        } else {
            System.out.println("Bye!");
            exit(0);
        }
    }
}
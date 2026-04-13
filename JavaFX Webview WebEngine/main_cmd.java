import java.util.Scanner;

public class main {
    public static void main() {
        System.out.println("Welcome!\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to start ui? (y/n) :");
        String que1 = sc.NextLine();

        if (que1 == "Y" && que1 == "y") {
            guilaunchclassname.guilaunchfuncname();
        } else {
            System.out.println("Okay!\n");
            System.out.println("Bye!\n");
            exit(0);
        }
    }
}
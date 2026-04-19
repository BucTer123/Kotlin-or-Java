import java.util.Scanner;

public class main {
    public static void Main() {
        System.out.println("Welcome!\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to start? (y/n) :");
        String c = sc.NextLine();

        if (c == "y" || c == "Y") {
            classnameaudio.funcnameaudio();
        } else {
            System.out.println("Bye!\n");
            exit(0);
        }
    }
}
import java.util.Scanner;

public class main {
    public static void Main() {
        System.out.println("Welcome!\n");

        System.out.println("Do you want to open this? (y/n) :");
        Scanner sc = new Scanner(System.in);

        String c = sc.NextLine();

        if (c == "y" || c == "Y") {
            classmainuiwidget.funcstartuiwidget();
        }
    }
}
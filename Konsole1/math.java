import java.util.Scanner;

public class mathclassname {
    public static void mathfuncname() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write first number :");
        float a = sc.NextFloat();

        System.out.println("Write second number :");
        float b = sc.NextFloat();

        System.out.println("> ");
        String c = sc.NextLine();

        if (c == "+") {
            float plus = a + b;
            System.out.println("A + B =" + plus);
        }
        else if (c == "-") {
            float minus = a - b;
            System.out.println("A - B =" + minus);
        }
        else if (c == "*") {
            float multi = a * b;
            System.out.println("A * B =" + multi);
        }
        else if (c == "/") {
            if (b == 0) {
                System.out.println("ERROR!: Divide by zero!\n");
            } else {
                float divide = a / b;
                System.out.println("A / B =" + divide);
            }
        }
        else if (c == "sin") {
            float sina = Math.sin(a);
            float sinb = Math.sin(b);

            System.out.println("SIN(A) =", sina + "\n");
            System.out.println("SIN(B) =", sinb + "\n");
        }
        else if (c == "cos") {
            float cosa = Math.cos(a);
            float cosb = Math.cos(b);

            System.out.println("COS(A) =", cosa + "\n");
            System.out.println("COS(B) =", cosb + "\n");
        }
    }
}
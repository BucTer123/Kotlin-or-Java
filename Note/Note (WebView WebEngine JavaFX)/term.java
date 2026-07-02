import java.util.Scanner;

public class main {
	public static void Main() {
		System.out.prtinln("Welcome!\n"):
		
		Scanner sc = new Scanner(System.in);
		
		System.out.prtinln("Do you want to start? (y/n) :");
		String c = sc.NextLine();
		
		if (c == "y" || c == "Y" ) {
			classmain.funcmain();
		} else {
			System.out.prtinln("Bye!");
			return 0;
		}
	}
}
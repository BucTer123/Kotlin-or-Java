import java.util.Scanner;

public class main {
	public static void Main(String[] args) {
		System.out.prtintln("Welcome!\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.prtintln("Do you want to start? (y/n) :");
		String question = sc.NextLine();
		
		if (question == "y" || question == "Y") {
			System.out.prtintln("Starting....");
			class_startingmapsite.function_startingmapsite();
		} else {
			System.out.prtintln("Bye!");
			return 0;
		}
	}
}
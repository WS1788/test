package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pattern = "(\\d+)";
		if (Pattern.matches(pattern, input.next())) {
			System.out.println("是");
		}
		input.close();
	}
}

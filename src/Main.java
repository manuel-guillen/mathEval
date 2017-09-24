import java.util.Scanner;

import translator.Expression;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (String str = scanner.nextLine(); !str.isEmpty(); str = scanner.nextLine())
			System.out.println(Expression.parse(str).derivative("x").simplify());
		
		scanner.close();
	}
	
}

package PROJECT220921;

import java.util.Scanner;

public class CODE6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.contentEquals("exit"))
				break;
		}
		System.out.println("종료합니다...");
		
		scanner.close();
	}
}

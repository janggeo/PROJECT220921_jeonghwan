package PROJECT220921;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char s = scanner.next().charAt(0);
		
		for(int i = s; i>='a'; i--) {
			for(int j='a'; j<=i;j++ ) {
			System.out.print((char)j);
			}
			System.out.println();
		}
	}
	
}
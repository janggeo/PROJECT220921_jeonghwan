package PROJECT220921;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		String user;
		String compute;
		String str[] = {"가위","바위","보"};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("컴퓨타와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			
			if(user.equals("그만")) break;
			
			compute = str[(int)(Math.random()*3)];
			
			System.out.println("사용자 = "+user+", 컴퓨터 = "+compute+", ");
			
			if(user.equals("가위") && compute.equals("바위")) {
				System.out.println("콤퓨타가 이겼습니다.");
			}
			else if(user.equals("가위") && compute.equals("보")) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(user.equals("바위") && compute.equals("가위")) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(user.equals("바위") && compute.equals("보")) {
				System.out.println("콤퓨타가 이겼습니다.");
			}
			else if(user.equals("보") && compute.equals("바위")) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(user.equals("보") && compute.equals("가위")) {
				System.out.println("콤퓨타가 이겼습니다.");
			}
			else {
				System.out.println("비겼습니다.");
				
			}
		}
	}
}

package PROJECT220921;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		
		System.out.println("금액을 입력하시오>>");
		int price = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			if(price/unit[i] == 0) continue;
			
			System.out.println(unit[i]+"원 짜리 :" +price/unit[i]+"개");
			price = price%unit[i];
		}
	}
}

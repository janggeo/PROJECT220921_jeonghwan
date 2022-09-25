package PROJECT220921;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		int temp;
		int idx;
		while(num<1 || num>100) {
			System.out.print("정수 몇개?");
			num = scanner.nextInt();	
		}
		
		int arr[]=new int[num];
		
		for(int i=0; i<num; i++) {
			idx=i;
			temp=(int)(Math.random()*100)+1;
			for(int j=0; j<i; j++){
				if(temp==arr[j]) {
					i--;
					idx=j;
					break;
				}
			}
			arr[idx]=temp;
		}
		
		for(int i=0; i<num; i++) {
			if(i%10==0) System.out.println();
			System.out.print(arr[i]+" ");
		}
		
	}
}

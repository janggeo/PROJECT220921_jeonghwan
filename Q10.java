package PROJECT220921;

import java.util.HashSet;
import java.util.Set;

public class Q10 {
	public static void main(String[] args) {
		int cnt=0;
		int num;
		
		int arr[][] = new int[4][4];
		HashSet<Integer>set = new HashSet<>();
		
		while(set.size()<10) {
			int temp = (int)(Math.random()*16);
			set.add(temp);
		}
		//System.out.println(set);
		for(int i :set) {
			arr[i/4][i%4]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}

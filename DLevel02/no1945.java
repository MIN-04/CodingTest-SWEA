package difficulty.level02;

import java.util.Scanner;

public class no1945 {
	
	/**
	 * 1945. 간단한 소인수분해
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//소인수 배열
			int[] prim = {2,3,5,7,11};
			//소인수 지수를 담을 배열
			int[] cnt = new int[5];
			//입력 값
			int num = sc.nextInt();
			
			while(num != 1) {
				for(int i=0; i<prim.length; i++) {
					if(num%prim[i]==0) {
						cnt[i] += 1;
						num /= prim[i];
					} 
				}
			}
			
			System.out.printf("#%d ",test_case);
			for(int i=0; i<cnt.length; i++) {
				System.out.printf("%d ",cnt[i]);
			}
			System.out.println();
			
		}
	}
}

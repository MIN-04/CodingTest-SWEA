package difficulty.level03;

import java.util.Scanner;

public class no10200 {
	
	/**
	 * 10200. 구독자 전쟁
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//테스트 케이스
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			//최대 , 최소
			int max = 0, min = 0;
			
			if(N<=A+B) {
				max = (A>B)? B : A;
				min = A+B-N;
			}else {
				max = (A>B)? B : A;
				min = 0;
			}
			
			System.out.printf("#%d %d %d\n",test_case,max,min);
			
		}
	}
}

package difficulty.level03;

import java.util.Scanner;

public class no10505 {
	
	/**
	 * 10505. 소득 불균형
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
			//합, 평균 변수
			int sum = 0, avg = 0;
			//count 변수
			int cnt = 0;
			//배열 초기화
			int[] arr = new int[N];
			
			for(int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			avg = sum / N;
			
			for(int i = 0; i<N; i++) {
				if(arr[i]<=avg) cnt++;
			}
			
			System.out.printf("#%d %d\n",test_case,cnt);
			
		}
	}
}

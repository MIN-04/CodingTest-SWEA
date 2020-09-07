package difficulty.level03;

import java.util.Scanner;

public class no1209 {
	
	/**
	 * 1209. [S/W 문제해결 기본] 2일차 - Sum
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//test case 번호
			int ts = sc.nextInt();
			//합 변수와 최댓값 변수
			int sum1 = 0;
			int sum2 = 0;
			int max = 0;
			//배열 초기화
			int[][] arr = new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//행,열 합
			for(int i=0; i<100; i++) {
				sum1 = 0;
				sum2 = 0;
				for(int j=0; j<100; j++) {
					sum1 += arr[i][j];
					sum2 += arr[j][i];
				}
				max = Math.max((sum1>sum2?sum1:sum2), max);
			}
			//대각선 합
			sum1 = 0;
			sum2 = 0;
			for(int i=0; i<100; i++) {
				sum1 += arr[i][i];
				sum2 += arr[i][99-i];
			}
			max = Math.max((sum1>sum2?sum1:sum2), max);
			
			System.out.printf("#%d %d\n",ts,max);
		}
	}
}

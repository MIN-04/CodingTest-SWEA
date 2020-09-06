package difficulty.level03;

import java.util.Arrays;
import java.util.Scanner;

public class no1208 {
	
	/**
	 * 1208. [S/W 문제해결 기본] 1일차 - Flatten
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//주어진 덤프 횟수
			int dump = sc.nextInt();
			//상자 높이 배열 초기화
			int[] box = new int[100];
			for(int i=0; i<100; i++) {
				box[i] = sc.nextInt();
			}
			//덤프 수행
			Arrays.sort(box);
			while(true) {
				
				box[99] -= 1;
				box[0] += 1;
				dump -= 1;
				
				Arrays.sort(box);
				
				if(box[99]-box[0]==0 || box[99]-box[0]==1) {
					System.out.printf("#%d %d\n",test_case,box[99]-box[0]);
					break;
				}else if(dump==0) {
					System.out.printf("#%d %d\n",test_case,box[99]-box[0]);
					break;
				}
			}
			
		}
	}
}

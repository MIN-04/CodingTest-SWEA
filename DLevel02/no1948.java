package difficulty.level02;

import java.util.Scanner;

public class no1948 {
	
	/**
	 * 1948. 날짜 계산기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//입력 받을 날짜
			int firstMth = sc.nextInt();
			int firstDay = sc.nextInt();
			int lastMth = sc.nextInt();
			int lastDay = sc.nextInt();
			
			//답
			int answer = 0;
			if(firstMth == lastMth) {
				answer += lastDay - firstDay + 1;
			}else {
				answer += (day[firstMth-1]-firstDay+1);
				answer += lastDay;
				
				for(int i = firstMth; i<lastMth-1; i++) {
					answer += day[i];
				}
			}
			
			System.out.printf("#%d %d\n",test_case,answer);
		}
	}
}

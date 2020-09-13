package difficulty.level03;

import java.util.Scanner;

public class no1289 {
	
	/**
	 * 1289. 원재의 메모리 복구하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//원본 값
			String str = sc.next();
			String[] answerArr = str.split("");
			//초기화 값
			String[] arr = new String[answerArr.length];
			for(int i=0; i<arr.length; i++) {
				arr[i] = "0";
			}
			//카운트
			int cnt = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(!arr[i].equals(answerArr[i])) {
					for(int j=i; j<arr.length; j++) {
						arr[j] = answerArr[i];
					}
					cnt++;
				}
			}
			System.out.printf("#%d %d\n",test_case,cnt);
			
		}
	}
}

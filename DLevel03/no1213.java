package difficulty.level03;

import java.util.Scanner;

public class no1213 {
	
	/**
	 * 1213. [S/W 문제해결 기본] 3일차 - String
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//테스트 케이스
			int tc = sc.nextInt();
			//찾을 문자
			String str = sc.next();
			str.toLowerCase();
			//입력받은 문자
			String w = sc.next();
			w.toLowerCase();
			
			String[] arr = w.split(str);
			int cnt = 0;
			
			if(w.substring(w.length()-str.length()).equals(str)) {
				cnt = arr.length;
			}else {
				cnt = arr.length -1;
			}
			
			System.out.printf("#%d %d\n",tc,cnt);
			
		}
	}
}

package difficulty.level03;

import java.util.Scanner;

public class no1215 {
	
	/**
	 * 1215. [S/W 문제해결 기본] 3일차 - 회문1
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//단어 길이
			int leng = sc.nextInt();
			//배열 초기화
			char[][] arr = new char[8][8];
			for(int i=0; i<8; i++) {
				String str = sc.next();
				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			//카운트할 변수
			int result = 0;
			
			for(int i=0; i<8; i++) {
				boolean flag;
				for(int j=0; j<8-leng+1; j++) {
					flag = true;
					//가로
					for(int k=0; k<leng/2; k++) {
						if(arr[i][j+k]!=arr[i][j+leng-k-1]) {
							flag = false;
							break;
						}
					}
					if(flag) result++;
					
					//세로
					flag = true;
					for(int k=0; k<leng/2; k++) {
						if(arr[j+k][i]!=arr[j+leng-k-1][i]) {
							flag = false;
							break;
						}
					}
					if(flag) result++;
				}
			}
			
			
			System.out.printf("#%d %d\n",test_case,result);
			
		}
	}
}

package difficulty.level03;

import java.util.Scanner;

public class no1206 {
	
	/**
	 * 1206. [S/W 문제해결 기본] 1일차 - View
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//가로 길이
			int width = sc.nextInt();
			//빌딩 층수를 저장할 배열
			int[] arr = new int[width];
			//조망권이 확보된 세대 수
			int home = 0;
			//배열 초기화
			for(int i=0; i<width; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=2; i<width-2; i++) {
				int floor = arr[i];
				if(floor>arr[i-2] && floor>arr[i-1] && floor>arr[i+1] && floor>arr[i+2]) {
					int max = arr[i-2];
					
					for(int j=i-1; j<=i+2; j++) {
						if(j!=i && max<arr[j]) {
							max = arr[j];
						}
					}
					
					home += (floor - max);
				}
			}
			System.out.printf("#%d %d\n",test_case,home);
			
		}
	}
}

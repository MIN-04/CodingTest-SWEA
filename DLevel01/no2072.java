package difficulty.level01;

import java.util.Scanner;

public class no2072 {
	
	/**
	 * 2072. Ȧ���� ���ϱ�
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int result = 0;
			
			for(int i=0;i<10;i++) {
				int num = sc.nextInt();
				if(num % 2 != 0) {
					result += num;
				}
			}
			
			System.out.printf("#%d %d\n",test_case,result);

		}
	}
}

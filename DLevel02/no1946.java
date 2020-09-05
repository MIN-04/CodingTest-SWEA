package difficulty.level02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no1946 {
	
	/**
	 * 1946. 간단한 압축 풀기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//문자를 저장할 큐
			Queue<String> q = new LinkedList<String>();
			//몇 번의 입력
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				String str = sc.next();
				int num = sc.nextInt();
				
				for(int j=0; j<num; j++) {
					q.add(str);
				}
			}
			
			System.out.printf("#%d\n",test_case);
			while(!q.isEmpty()) {
				for(int i=0; i<10; i++) {
					System.out.printf("%s",q.poll());
					if(q.isEmpty()) break;
				}
				System.out.println();
			}
			
		}
	}
}

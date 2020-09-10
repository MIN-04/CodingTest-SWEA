package difficulty.level03;

import java.util.Arrays;
import java.util.Scanner;

public class no9940 {
	
	/**
	 * 9940. 순열1
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			String answer = "Yes";
			
			Arrays.sort(arr);
			
			for(int i=0; i<N-1; i++) {
				int num = arr[i];
				if(num == arr[i+1]) {
					answer = "No";
					break;
				}
			}
			System.out.printf("#%d %s\n",test_case,answer);
			
		}
	}
}

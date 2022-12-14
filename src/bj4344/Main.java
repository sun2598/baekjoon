package bj4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			
			double[] arr = new double[n];
			
			double sum = 0;
			for(int j=0; j<n; j++) {
				// 배열 생성
				int val = Integer.parseInt(st.nextToken()); // 토큰 먼저 변수에 담기.
				arr[j] = val; // 그 다음에 배열에 대입.
				sum += val;
			}
			// 평균구하기
			double avg = sum / n;
		
			double count = 0;
			for(int j=0; j<n; j++) {
				// 평균 넘는 애들 구하기
				if(arr[j] > avg) {
					count++;
				}
			}
			double percent = count / n;
			
			// 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
			System.out.printf("%.3f%%\n", percent*100);
		}
		
		
	}

}

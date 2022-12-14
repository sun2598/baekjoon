package bj8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {

			int count = 0; // 연속횟수
			int sum = 0; // 누적합산
			
			// getBytes() : 입력 문자열을 byte 단위의 '배열'로 반환시켜주는 메소드
			for(byte value : br.readLine().getBytes()) {
				
				if(value == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);
	}

}

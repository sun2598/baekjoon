package bj1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double[] arr = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr); // 정렬하면 끝값이 최대값
		
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		
		System.out.println(sum/arr.length);

	}

}

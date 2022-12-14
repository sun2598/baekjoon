package bj3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int a = 1 - Integer.parseInt(st.nextToken());
		int b = 1 - Integer.parseInt(st.nextToken());
		int c = 2 - Integer.parseInt(st.nextToken());
		int d = 2 - Integer.parseInt(st.nextToken());
		int e = 2 - Integer.parseInt(st.nextToken());
		int f = 8 - Integer.parseInt(st.nextToken());
		
		System.out.printf("%d %d %d %d %d %d", a,b,c,d,e,f);
	}

}

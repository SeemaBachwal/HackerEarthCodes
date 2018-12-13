package com.play.with.nums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UploadActivity {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = 0, q = 0, l = 0, r = 0;
		while (st.hasMoreElements()) {
			n = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
		}
		int arr[] = new int[n];
		String[] inputVal = br.readLine().split(" ");
		for (int i = 0; i < inputVal.length; i++) {
			arr[i] = Integer.parseInt(inputVal[i]);
		}
		while (q != 0) {
			int sum = 0, count = 0;
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			while (st1.hasMoreElements()) {
				l = Integer.parseInt(st1.nextToken());
				r = Integer.parseInt(st1.nextToken());
				for (int i = l; i <= r; i++) {
					sum = sum + arr[i - 1];
					count++;
				}
				int mean = sum / count;
				System.out.println(mean);
			}
			q--;
		}

	}

}

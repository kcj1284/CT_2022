package baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2042 {
    static long[] arr, tree;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

        tree = new long[n * 4];

        init(1, n, 1);

        for (int i = 0; i < m + k; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());

			if (a == 1) {
				long dif = c - arr[b];
				arr[b] = c;
				update(1, n, 1, b, dif);
			} else if (a == 2) {
				sb.append(sum(1, n, 1, b, (int) c) + "\n");
			}
		}

        System.out.println(sb);
    }

    public static long init(int start, int end, int node) {
		if (start == end) {
			return tree[node] = arr[start];
		}

		int mid = (start + end) / 2;

		// 재귀적으로 두 부분으로 나눈 뒤에 그 합을 자기 자신으로 함.
		return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
	}

    public static long sum(int start, int end, int node, int left, int right) {
		// 범위 밖에 있는 경우
		if (left > end || right < start) {
			return 0;
		}

		// 범위 안에 있는 경우
		if (left <= start && end <= right) {
			return tree[node];
		}

		// 그렇지 않다면, 두 부분으로 나누어 합을 구하기
		int mid = (start + end) / 2;
		return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right);
	}

    public static void update(int start, int end, int node, int idx, long dif) {
		// 범위 밖에 있는 경우
		if (idx < start || idx > end) {
			return;
		}

		// 범위 안에 있으면 내려가며 다른 원소도 갱신
		tree[node] += dif;
		if (start == end) {
			return;
		}

		int mid = (start + end) / 2;
		update(start, mid, node * 2, idx, dif);
		update(mid + 1, end, node * 2 + 1, idx, dif);
	}

}

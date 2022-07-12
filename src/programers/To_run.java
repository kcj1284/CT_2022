package programers;

class Solution {
	public int solution(int m, int n, int[][] puddles) {
		int arr[][] = new int[m+1][n+1];

		for (int i = 0; i < puddles.length; i++) {
			arr[puddles[i][0]][puddles[i][1]] = -1;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i][j]==-1) {
					arr[i][j] = 0;
					continue;
				}
					
				arr[i][j] = (arr[i - 1][j] + arr[i][j - 1])%1000000007;
				
				arr[1][1] = 1;
					
			}
		}

		return arr[m][n]%1000000007;
	}
}
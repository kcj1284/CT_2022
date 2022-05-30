package programers;

import java.util.Stack;

class prgms_doll {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> ans = new Stack<>();
		ans.push(0);
		for (int k : moves) {
			for (int i = 0; i < board[0].length; i++) {
				if (board[i][k - 1] != 0) {
					if (board[i][k - 1] == ans.peek()) {
						ans.pop();
						answer += 2;
						board[i][k - 1] = 0;
						break;
					} else if (board[i][k - 1] != ans.peek()) {
						ans.push(board[i][k - 1]);
						board[i][k - 1] = 0;
						break;
					}
				}
			}
		}
		return answer;
	}
}
package programers;

class prgms_strringzip {
	public static int solution(String s) {
		int answer = s.length();
		int len = s.length();
		int same = 0;
		String str = "";
		String ans = "";

		for (int i = 1; i <= (len / 2); i++) {
			ans = "";
			for (int j = 0; j <= len - i; j = j + i) {
				String temp = s.substring(j, j + i);

				if (str.equals(temp)) {
					same++;
				}

				else {
					str = temp;
					if (same != 0)
						ans = ans + Integer.toString(same);
					ans = ans + temp;
				}
			}
			if (answer > ans.length())
				answer = ans.length();
		}
		System.out.println(ans + " " + ans.length());
		return answer;
	}
}

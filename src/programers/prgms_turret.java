package programers;

public class prgms_turret {

	class Solution {
		public int solution(int[][] targets) {
			int answer = 0;
			Arrays.sort(targets, (o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
			int pre_str = targets[0][0];
			int pre_end = targets[0][1];

			for(int target:targets){
				if(answer==0){answer = 1;continue;}

				int cur_str = target[0];
				int cur_end = target[1];
				
				if(pre_str<=cur_str&&cur_str<pre_end){
					pre_str = Math.max(pre_str,cur_str);
					pre_end = Math.min(pre_end,cur_end);
				}
				else {
					pre_str = cur_str;
					pre_end = cur_end;
					answer++;
				}
			}
			return answer;
		}
}
}

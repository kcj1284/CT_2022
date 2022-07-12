package programers;

public class prgms_falseper {

	public int[] solution(int N, int[] stages) {

		int[] check = new int[N]; // 1�ܰ��� ���� ������ �迭
		double[] rate = new double[N]; // 2�ܰ��� �������� ������ �迭
		int[] answer = new int[N];
		/*
		 * [1] N������ �ڿ����� �����Ǵ� ���� ����
		 */
		for(int i=0;i<stages.length;i++) {
			if(stages[i]<=N)
				check[stages[i]-1]++;
		}
		/*
		 * [2] �������� ���ϴ� ��
		 */
		int denominator = stages.length;
		for (int i = 0; i < check.length; i++) {
			int numerator = check[i];
			if (denominator == 0) {
				rate[i] = 0;
			} else {
				rate[i] = (double) numerator / denominator;
			}
			denominator -= check[i];
		}
		/*
		 * [3] answer�� ���Ѵ� (selection sort ��� �̿�)
		 */
		
		double max = 0;
		int target = 1;
		for (int i = 0; i < rate.length; i++) {
			max = rate[0];
			target = 1;
			for (int j = 0; j < rate.length; j++) {
				if (rate[j] > max) {
					max = rate[j];
					target = j + 1;
				}
			}
			rate[target - 1] = -1;
			answer[i] = target;
		}

		return answer;
	}
}

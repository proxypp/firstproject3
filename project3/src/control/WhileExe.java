package control;

public class WhileExe {
	public static void main(String[] args) {
		// while ������ ����ؼ� 1 ~ 10���� ���.
		int i = 0;
		int d = 1;
		int j = 0;

		int sum = 0;
		while (i < 10) {

			i++;
			System.out.printf("i�ǰ���: %d", i);
		}
		System.out.println();
		while (j < 10) {

			j = j + 2;

			System.out.printf("j�ǰ���: %d", j);
		}
		System.out.println();
		int k = -1;
		
		while (k < 9) {
			k = k + 2;
			System.out.printf("k�ǰ���: %d", k);
		}
		System.out.println();
		while (d <= 10) {
			sum += d;
			d++;

		}
		System.out.println(sum);
	}
}

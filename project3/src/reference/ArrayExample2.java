package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1~10���� ���� ���� ����.
		// �л� 10��.
		int[] scores = new int[10];

		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;

			System.out.println(temp);
		}

		for (int i = 0, l = scores.length; i < l; i++) {
			System.out.printf("scores[%d] => %d\n", i, scores[i]);
		}
		System.out.println("��1.");
		// �迭�� ����ִ� ��ҵ��� ��.
		int sum = 0;
		// �迭�� �հ�:55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�迭���հ� : " + sum);
		System.out.println("��2.");

		// �迭�� ����� 5���� ū ���� �հ�.
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 5) {
				sum2 += scores[i];
			}
		}
		System.out.println("5���� ū�� �迭���հ� : " + sum2);
		System.out.println("��3.");
		int sum3 = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] % 2 == 0) {
				sum3 += scores[i];
			}
			
		}
		System.out.println("¦����° �հ� " +sum3 );
		System.out.println("��4.");	
	}
}

package control;

public class ForExe {

	public static void main(String[] args) {
		// 1~10 ���
		// ��1.
		// 1~10 �߿��� 2,4,6,8,10
		// 1~10���� ���� ���ϵ���.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("��1.");
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("��2.");

		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("��3.");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;

		}
		System.out.println(sum);
		System.out.println("��4.");

	}

}

package reference;

import java.util.Iterator;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwang" };
		System.out.println(strAry.length);

		// == ,equals()

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("====�ٽ�====");
		// Enhanced for
		for (String name : strAry) {
			System.out.println(name);
		}
		int[] scores = { 50, 70, 80, 50 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		//�л� 3��. 4.2, 3.5, 2.8 �迭����.
		//�հ踦 ���� �� �ֵ��� ����.
		//����� ����ؼ� avg2
		// �л� ��� : 3.4 �Դϴ�
		double [] sc = {4.2, 3.5, 2.8};
		double sum1= 0;
		double avg = 0;
		for (double scs : sc) {
			sum1 += scs;
			avg = sum1/sc.length;
		}
		System.out.println(sum1);
		System.out.println(avg);
	}
}

package reference;

public class ForExample {

	public static void main(String[] args) {
		int sum2=0;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
	
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		}

		System.out.println("��1.");
		// 1~10 ¦���� ���..

		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) {
				sum+=i;
				System.out.println(i);
			}		
		}		
		System.out.println("��2.");
		// 1~10 Ȧ���� ��.
		
		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) {
				sum2+=i;
			}		
		}
		System.out.println("�հ�: " +sum);
		System.out.println("��3.");
		// Ȧ���� ��츸 �հ�.
		int cnt= 0;// Ƚ���� �޾ƿͼ� ���.
		int i = 1;
		for (; i <= 10; i++) {
				sum+=i;
			if (sum>=20) {
				cnt=i;
				break;
				//i���� ��ȯ
			}
		}
		System.out.println("Ƚ��: " +cnt);
		System.out.println("��4.");
		// Ȧ���� ��츸 �հ�.		
	}

}

package control;

public class ConditionExe {

	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, ���հ�
		// ��.
		// �μ��� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��

		// ���մ��Կ�����
		// 4...2�ǹ��..
		// 2�� ����̸� 2�ǹ��, 3�ǹ���̸� 3�ǹ��, 2��3�ǹ��
		//3�� ��.
		
		
		// ����ġ ���ǹ� -> 1�� ���Խ��ϴ�.
		// 4����.
		
		int randomScore =0; //0~99�����ǰ��� ���ϵ���
		
		int randomValue =(int) (Math.random()*100);
		System.out.println(randomValue+"��");
		if (randomValue>=90) {
			System.out.println("A����");
		}else if (randomValue>=80) {
			System.out.println("B����");
		}else if (randomValue>=70) {
			System.out.println("C����");
		}else if (randomValue>=60) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
		System.out.println("��5.");
		
		
		
		//int randomValue =(int) (Math.random()*6)+1;
		switch(randomValue) {
		case 1 :
			System.out.println("1�� ���Խ��ϴ�");
			break;
		case 2 :
			System.out.println("2�� ���Խ��ϴ�");
			break;
		case 3 :
			System.out.println("3�� ���Խ��ϴ�");
			break;
		case 4 :
			System.out.println("4�� ���Խ��ϴ�");
			break;
		case 5 :
			System.out.println("5�� ���Խ��ϴ�");
			break;
		case 6 :
			System.out.println("6�� ���Խ��ϴ�");
		}
		System.out.println("��4.");
		
		
		int num1 = 60;
		int num2 = 60;
		int result = num1 + num2;
		if (result > 100) {
			System.out.println("�հ��Դϴ�.");
		} else if (result <= 100) {
			System.out.println("���հ��Դϴ�.");

		}
		System.out.println("��.");

		if (result % 2 == 0) {
			System.out.println("¦��");
		} else if (result % 2 != 0) {
			System.out.println("Ȧ��");
		}

		int num = 12;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2�� 3�ǹ��");
		} else if (num % 3 == 0) {
			System.out.println("3�ǹ��");
		} else if (num % 2 == 0) {
			System.out.println("2�ǹ��");
		}
		System.out.println("��3.");
	}

}

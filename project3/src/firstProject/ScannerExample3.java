package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������Է�;
		//���������Է�;
		//�̸� �Է�;
		//ȫ�浿���� ����, ���������� ���� ?, ����� ? �Դϴ�
		//��� 60�� ���Ͽ��� ȫ�浿���� (��)�հ��Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է����ּ���...");
		int num1= sc.nextInt();
		
		System.out.println("���������� �Է����ּ���...");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.nextLine();
		
		int avg = (num1+num2)/2;
		
		System.out.printf("%s ���ǿ���,���� ������ ���� %d ����� %d ", name, num1+num2, avg);
		System.out.println();
		if (avg>60) {
			System.out.println(name+"���� �հ��Դϴ�...");
		}else {
			System.out.println(name+"���� ���հ��Դϴ�...");
		}
		
		
	}

}

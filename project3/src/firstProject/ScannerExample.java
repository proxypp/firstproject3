package firstProject;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���...");
		String name = scn.nextLine(); // 1ch Enter
		System.out.println("���̸� �Է��ϼ���...");
		int age = scn.nextInt(); // 20 Enter.
		scn.nextLine();
		System.out.println("��̸� �Է��ϼ���...");
		String hobby = scn.nextLine(); //1ch Enter
		
		System.out.println("[�Է��� ��]");
		System.out.printf("�̸�: %s, ����: %d, ���: %s", name, age, hobby);
		
	}

}

package firstProject;

import java.util.Scanner;

public class KimYoungOh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "�迵��";
		
		System.out.println(name);
		System.out.println("���������� �Է��ϼ���...");
		int num1 = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���...");
		int num2 = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���...");
		int num3 = sc.nextInt();
		
		int avg = (num1+num2+num3)/3;
		
		System.out.printf("��������: %d, ��������: %d, ��������: %d",num1, num2, num3 );
		System.out.println();
		System.out.printf("%s �� �����: %d",name, avg);
		
		
	}

}

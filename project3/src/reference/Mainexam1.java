package reference;

import java.util.Scanner;

public class Mainexam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �л� �� ����, 2. �л� �̸��Է�, 3.����Ʈ ��� 4.����
		String[] names = null;
		int[] scores = null;
		showStudent();
		int choice = readInt("��ȣ�� �����ϼ���>>");
			
		if (choice == 1) {
			int size = createStudent();
			 scores = new int[size];
		} else if (choice == 2) {
			String ddd = readname;
			names = new int[ddd];
		} else if (choice == 3) {
			
		} else if (choice == 4) {
			
		}

	}

	public static void showStudent() {
		System.out.println("1.�л� �� ����, 2.�л� �̸��Է�, 3.����Ʈ ���, 4.����");

	}

	public static int createStudent() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;
	}

	public static String readname(String ary[]) {
		for (int i = 0; i < ary.length; i++) {
			
			ary[i] = readLine("�л��̸��� �Է��ϼ���.");
		
		}
		
	}

	public static int readInt(String msg) {

		Scanner Sc = new Scanner(System.in);
		System.out.println(msg);
		int menu = Sc.nextInt();
		return menu;
	}
	public static String readLine(String msg) {

		Scanner Sc = new Scanner(System.in);
		System.out.println(msg);
		String menu = Sc.nextLine();
		return menu;
	}

}

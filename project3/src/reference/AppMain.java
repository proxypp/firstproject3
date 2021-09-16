package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л������� ���� �����м�.

		// �л��ο� ����, �л�����, ��ü����Ʈ, �м�: ���, �ְ���, ����.

		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];
				
			}else if (choice==2) {	
				inputValue(scores);
				
			}else if (choice==3) {
				showList(scores);
				
			}else if (choice==4) {
				analysis(scores);
				
			}else if (choice==5) {
				break;

			}
		}
		System.out.println("��.");
	}

	public static void showMenu() {
		
			
		
		System.out.println("1: �л��ο� ����, 2: �л�����, 3: ��ü����Ʈ, 4: �м�:���, �ְ��� 5: ����.");
		
	}

	public static int createStudent() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
		System.out.println("���� �л����� �Է��ϼ���.");
			return;	
		}
		for (int i = 0; i < ary.length; i++) {
			
			ary[i] = readInt("�л������� �Է��ϼ���.");
		
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");
			return;	
			}
		for(int i=0; i<ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d] => %d\n", i, ary[i]);
			
		}
	}

	public static void analysis(int[] ary) {
		//���, �ְ��� => �ܼ�.
		//�ڵ� ����.........
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");
			return;	
			}
		int avg = 0;
		int Max = 0;
		for(int i = 0; i<ary.length; i++) {
			avg += ary[i]/ary.length;
			if(Max < ary[i]) {
				Max = ary[i];
			}
			
			
		}	System.out.printf("���: %d, �ְ���: %d\n", avg, Max );
	}

	public static int readInt(String msg) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println(msg);
		int menu = Sc.nextInt();
		return menu;
	}
}

package control;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			System.out.printf("i�� ���� %d\n", i);
			i++;

		}
//		boolean run = true;
		int cnt = 0;
		while (true) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if (cnt == 8) {
//				run = false;
				break;
			}

		}
		
		System.out.println("��.");
	}

}

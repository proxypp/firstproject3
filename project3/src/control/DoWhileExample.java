package control;

public class DoWhileExample {
	public static void main(String[] args) {
		// Do..While
		boolean run = false;

		while (run) {
			System.out.println("���๮1.");
		}
		int cnt = 0;

		do {
			cnt++;
			if (cnt % 2 == 1) {
				continue;
			}
			System.out.println(cnt);
			if (cnt >= 4) {
				break;
			}
		} while (true);
//			System.out.println("���๮2.");
			System.out.println("��.");
	}
}
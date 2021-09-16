package control;

public class ForExe {

	public static void main(String[] args) {
		// 1~10 출력
		// 끝1.
		// 1~10 중에서 2,4,6,8,10
		// 1~10까지 합을 구하도록.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1.");
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("끝2.");

		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("끝3.");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;

		}
		System.out.println(sum);
		System.out.println("끝4.");

	}

}

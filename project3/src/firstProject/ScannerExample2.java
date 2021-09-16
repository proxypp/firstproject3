package firstProject;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 : 사용자 입력 ( 10, 20)
		// 10 + 20 = 30
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요...");
		int num1 =sc.nextInt();
		System.out.println("숫자를 입력하세요...");
		int num2 =sc.nextInt();
		System.out.println(num1 + num2);
		
	}

}

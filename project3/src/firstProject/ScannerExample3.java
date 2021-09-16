package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영어점수입력;
		//수학점수입력;
		//이름 입력;
		//홍길동님의 영어, 수학점수의 합은 ?, 평균은 ? 입니다
		//평균 60점 이하에서 홍길동님은 (불)합격입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("영어점수를 입력해주세요...");
		int num1= sc.nextInt();
		
		System.out.println("수학점수를 입력해주세요...");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		
		int avg = (num1+num2)/2;
		
		System.out.printf("%s 님의영어,수학 점수의 합은 %d 평균은 %d ", name, num1+num2, avg);
		System.out.println();
		if (avg>60) {
			System.out.println(name+"님은 합격입니다...");
		}else {
			System.out.println(name+"님은 불합격입니다...");
		}
		
		
	}

}

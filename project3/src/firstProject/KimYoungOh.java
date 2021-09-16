package firstProject;

import java.util.Scanner;

public class KimYoungOh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "김영오";
		
		System.out.println(name);
		System.out.println("수학점수를 입력하세요...");
		int num1 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요...");
		int num2 = sc.nextInt();
		System.out.println("국어 점수를 입력하세요...");
		int num3 = sc.nextInt();
		
		int avg = (num1+num2+num3)/3;
		
		System.out.printf("수학점수: %d, 영어점수: %d, 국어점수: %d",num1, num2, num3 );
		System.out.println();
		System.out.printf("%s 의 평균은: %d",name, avg);
		
		
	}

}

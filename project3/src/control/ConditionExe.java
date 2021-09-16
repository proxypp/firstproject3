package control;

public class ConditionExe {

	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과 100점 넘어서면 합격, 불합격
		// 끝.
		// 두수를 곱해서 짝수이면 짝수, 홀수이면 홀수

		// 복합대입연산자
		// 4...2의배수..
		// 2의 배수이면 2의배수, 3의배수이면 3의배수, 2와3의배수
		//3번 끝.
		
		
		// 스위치 조건문 -> 1이 나왔습니다.
		// 4번끝.
		
		int randomScore =0; //0~99임의의값을 더하도록
		
		int randomValue =(int) (Math.random()*100);
		System.out.println(randomValue+"점");
		if (randomValue>=90) {
			System.out.println("A학점");
		}else if (randomValue>=80) {
			System.out.println("B학점");
		}else if (randomValue>=70) {
			System.out.println("C학점");
		}else if (randomValue>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		System.out.println("끝5.");
		
		
		
		//int randomValue =(int) (Math.random()*6)+1;
		switch(randomValue) {
		case 1 :
			System.out.println("1이 나왔습니다");
			break;
		case 2 :
			System.out.println("2이 나왔습니다");
			break;
		case 3 :
			System.out.println("3이 나왔습니다");
			break;
		case 4 :
			System.out.println("4가 나왔습니다");
			break;
		case 5 :
			System.out.println("5가 나왔습니다");
			break;
		case 6 :
			System.out.println("6이 나왔습니다");
		}
		System.out.println("끝4.");
		
		
		int num1 = 60;
		int num2 = 60;
		int result = num1 + num2;
		if (result > 100) {
			System.out.println("합격입니다.");
		} else if (result <= 100) {
			System.out.println("불합격입니다.");

		}
		System.out.println("끝.");

		if (result % 2 == 0) {
			System.out.println("짝수");
		} else if (result % 2 != 0) {
			System.out.println("홀수");
		}

		int num = 12;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의배수");
		} else if (num % 3 == 0) {
			System.out.println("3의배수");
		} else if (num % 2 == 0) {
			System.out.println("2의배수");
		}
		System.out.println("끝3.");
	}

}

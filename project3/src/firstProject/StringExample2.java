package firstProject;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김영오";
		int age = 25;
		
		//이름은 김영오, 나이는 25
		System.out.println("이름은"+name+",나이는" +age );
		System.out.printf("이름은 %s, 나이는 %d", name, age);
		System.out.println();
		//b1(byte) = 90
		//b2(byte) = 10
		//result = b1 + b2의 합
		//90 + 10 = 100 (콘솔출력)
		//isLarger
		//result > 0
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(result);
		boolean isLarger = true;
		isLarger = b1 > b2;
		if (isLarger) {
		 	System.out.println("크다");
		} else {
			System.out.println("작다");
		}
		
		// 2200000000, 78, 8
		// avg 78 / 8
		// 120을 16으로 나눈 결과: 7.5
		
		long num = 2200000000L;
		int A = 78;
		int B = 8;
		double avg = (double)A / B;
		long avg1 = (long)num/B;
		System.out.println(avg);
		System.out.println(avg1);
		
		//
		
		
	}

}

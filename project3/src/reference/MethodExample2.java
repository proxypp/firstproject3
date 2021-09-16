package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24, 55); //메소드 실행.
		int a = 45, b= 77;
		sum (a, b);
		
		multi(35, 88);
		square(3.5);
		int res = getMax(a, b);
		System.out.println("큰 수는 : " +res);
		int c = 5, d = 3;
		double dd = divide(c, d);
		System.out.println(dd);
		
	}
	// 두 정수를 입력받아서 두수의 합을 console 보여주기.
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두수의합 : " +sum);
	}
		//두 정수를 입력받아서 두수의 곱을 console 보여주기.
	public static void multi(int i1, int i2) {
		int sum = i1*i2;
		System.out.println("두수의 곱: "+sum);
		
	}
	//정사각형 넓이를 계산해주는 메소드.
	public static void square(double side) {
		double sum1 = side*side;
		System.out.println("정사각형의 넓이: "+sum1);
		
	}
	//두수 중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int num1, int num2) {
		 int result = (num1>=num2) ? num1 : num2;
		 	
		return result;
	}
	// 두 수를 입력받아서 첫번째 / 두번째 나눈 결과 반환
	public static double divide(int a, int b) {
		double result1 = (double)a / b;
		
		return result1;
		
		
	
	
	}
}
	


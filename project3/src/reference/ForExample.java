package reference;

public class ForExample {

	public static void main(String[] args) {
		int sum2=0;
		int sum=0;
		for (int i = 1; i <= 10; i++) {
	
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		}

		System.out.println("끝1.");
		// 1~10 짝수만 출력..

		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) {
				sum+=i;
				System.out.println(i);
			}		
		}		
		System.out.println("끝2.");
		// 1~10 홀수의 합.
		
		for (int i = 1; i <= 10; i++) {
			if (i%2!=0) {
				sum2+=i;
			}		
		}
		System.out.println("합계: " +sum);
		System.out.println("끝3.");
		// 홀수인 경우만 합계.
		int cnt= 0;// 횟수를 받아와서 출력.
		int i = 1;
		for (; i <= 10; i++) {
				sum+=i;
			if (sum>=20) {
				cnt=i;
				break;
				//i값을 반환
			}
		}
		System.out.println("횟수: " +cnt);
		System.out.println("끝4.");
		// 홀수인 경우만 합계.		
	}

}

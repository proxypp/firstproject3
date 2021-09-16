package reference;

public class MethodExample3 {

	public static void main(String[] args) {
		
		int [] intAry = {30,40,50,60,70};
		int sum = 0;
		for(int num : intAry) {
			sum+=num;
			
		}
		System.out.println("합 : "+sum);
		
		sum=0;
		int[] intAry2 = {30, 40};
		sum = sumArray (intAry2);
		System.out.println("합2:" +sum);
		
		double avg = 0;
		avg = avgArray (intAry);
		System.out.println("평균 : " +avg);
		avg = 0;
		avg = avgArray (intAry2);
		System.out.println("평균2 : " +avg);
		
		
	}
	//배열을 매개변수.
	
	public static int sumArray(int[] intAry) {
		int sum=0;
		for (int num : intAry) {
			sum+=num;
		}
		return sum;
	}
	//배열을 매개변수 - > 평균
	
	public static double avgArray(int[] intAry) {
		int sum2=0;
		double avg = 0;
		for (int num : intAry) {
			sum2+=num;
			 avg = (double)sum2/intAry.length;
		}
		return avg;
	}
	
	
}

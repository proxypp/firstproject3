package reference;

public class MethodExample3 {

	public static void main(String[] args) {
		
		int [] intAry = {30,40,50,60,70};
		int sum = 0;
		for(int num : intAry) {
			sum+=num;
			
		}
		System.out.println("�� : "+sum);
		
		sum=0;
		int[] intAry2 = {30, 40};
		sum = sumArray (intAry2);
		System.out.println("��2:" +sum);
		
		double avg = 0;
		avg = avgArray (intAry);
		System.out.println("��� : " +avg);
		avg = 0;
		avg = avgArray (intAry2);
		System.out.println("���2 : " +avg);
		
		
	}
	//�迭�� �Ű�����.
	
	public static int sumArray(int[] intAry) {
		int sum=0;
		for (int num : intAry) {
			sum+=num;
		}
		return sum;
	}
	//�迭�� �Ű����� - > ���
	
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

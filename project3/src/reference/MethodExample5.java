package reference;

public class MethodExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 88, 67, 92, 73, 58 };
		int minVal =0;
		minVal= getminValue(scores);
		System.out.println("ÃÖ¼Ú°ª : "+minVal);
		System.out.println("³¡1.");
		
		
		
	}
	public static int getminValue(int[] ary){
		int minValue = ary[1];
		for(int i=0; i<ary.length; i++) {
			if(minValue>ary[i]) {
				minValue = ary[i];
			}
		}
		return minValue;
	}
}

package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24, 55); //�޼ҵ� ����.
		int a = 45, b= 77;
		sum (a, b);
		
		multi(35, 88);
		square(3.5);
		int res = getMax(a, b);
		System.out.println("ū ���� : " +res);
		int c = 5, d = 3;
		double dd = divide(c, d);
		System.out.println(dd);
		
	}
	// �� ������ �Է¹޾Ƽ� �μ��� ���� console �����ֱ�.
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�μ����� : " +sum);
	}
		//�� ������ �Է¹޾Ƽ� �μ��� ���� console �����ֱ�.
	public static void multi(int i1, int i2) {
		int sum = i1*i2;
		System.out.println("�μ��� ��: "+sum);
		
	}
	//���簢�� ���̸� ������ִ� �޼ҵ�.
	public static void square(double side) {
		double sum1 = side*side;
		System.out.println("���簢���� ����: "+sum1);
		
	}
	//�μ� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int num1, int num2) {
		 int result = (num1>=num2) ? num1 : num2;
		 	
		return result;
	}
	// �� ���� �Է¹޾Ƽ� ù��° / �ι�° ���� ��� ��ȯ
	public static double divide(int a, int b) {
		double result1 = (double)a / b;
		
		return result1;
		
		
	
	
	}
}
	


package firstProject;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "�迵��";
		int age = 25;
		
		//�̸��� �迵��, ���̴� 25
		System.out.println("�̸���"+name+",���̴�" +age );
		System.out.printf("�̸��� %s, ���̴� %d", name, age);
		System.out.println();
		//b1(byte) = 90
		//b2(byte) = 10
		//result = b1 + b2�� ��
		//90 + 10 = 100 (�ܼ����)
		//isLarger
		//result > 0
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(result);
		boolean isLarger = true;
		isLarger = b1 > b2;
		if (isLarger) {
		 	System.out.println("ũ��");
		} else {
			System.out.println("�۴�");
		}
		
		// 2200000000, 78, 8
		// avg 78 / 8
		// 120�� 16���� ���� ���: 7.5
		
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

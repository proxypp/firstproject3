package firstProject;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int age1 = 25;
		
		String name = "ȫ�浿";
		String name1 = "������";
		
		long myAge = age;	//�ڵ�����ȯ(promotion)
		age = (int)myAge;	//��������ȯ(casting)
		
//		age = "ȫ�浿";
//		name = 20;
		
		System.out.println(name + "�� ���̴� " + age);
		System.out.println(name1 + "�� ���̴� " + age1 + "�Դϴ�.");
	}

}

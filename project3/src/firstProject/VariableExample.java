package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		// �̸�, ����, ��/����
		int age = 25;
		String name = "������";
		boolean isOk = true;
		
//		isOk = age >= 25;
		
		if(age >= 25) {
			System.out.println(name + "�� " + "25�� �̻�");
		}

//		isOk = age <= 25;
		
		if(age <= 25) {
			System.out.println(name + "�� " + "25�� ����");
		}
		
		System.out.println("end of program.");
  }
}

package control;

public class ControlSwitch {

	public static void main(String[] args) {
		String inputValue = "D";
		
		switch(inputValue) {
		case "A": 
			System.out.println("�� ���߽��ϴ�.");
			break;
		case "B":
			System.out.println("���߽��ϴ�.");
			break;
		case "C":
			System.out.println("�����Դϴ�.");
			break;
		case "D":
			System.out.println("����ϼ���.");
			break;
		default:
			System.out.println("�Ǹ��Դϴ�.");
		
		//
		switch(inputValue) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		
		case "D":
			System.out.println("Retry");
			break;		
		
		default:
			System.out.println("Fail");
			break;
		}
		}
	}
}

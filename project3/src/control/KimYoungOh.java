package control;

public class KimYoungOh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if for(while) break, continue
		// ���� -> �ڵ�.
		// å�� 500�������̻��϶� �Ϸ翡 1~20�������� �д´�. 50�ϵ��� ���������� �о��°�.
		int a;
		int b = 50;
		int c = 0;
		int sum=0;
		for (int i = 0; i <= b; i++) {
			c = (int) (Math.random() * 20) + 1;			
				sum+=c;
			if (c >= 500) {
				
				break;
			}System.out.printf("%d �ϵ��� ���� å������: %d ", i, sum);
			System.out.println();
		}
		
	}
}
package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;

		// 1 ���� 10���� ���.
		// ��.
		// ¦���� ���.
		int i = 0;
		int j = 0;
		int k = -1;
		int sum = 0;
		do {
			i++;
			System.out.println(i);
			if (i >= 10) {
				break;
			}
		} while (true);
		System.out.println("��1.");
		do {
			j=j+2;
			if (j%2!=0) {
				continue;
			}
			System.out.println(j);
			if (j >= 10) {
				break;
			}
		} while (true);
		System.out.println("��2.");

		do {
			k = k + 2;
			sum+=k;
			if (k >= 9) {
				break;
			}
		} while (true);
		System.out.println(sum);
	    System.out.println("��3.");
	    //�����ǰ��� 1~10;
	    //sum���� 100 ���� ū ���� �Ǿ�����
	    // �� ���� sum ���� ���...��� ������ �ߴ��������ֵ���...
	    // sum : 101, ���� : 13
	   int a;
	   int b=0;
	   int sum1 = 0;
	    do {
	    	a =(int) (Math.random()*10)+1;
	    	sum1+=a;
	    	b=b+1;
	    	if(sum1>100) {
	    	break;
			}
		} while (true);
	    System.out.println(sum1);
	    System.out.println(b);
	}

}

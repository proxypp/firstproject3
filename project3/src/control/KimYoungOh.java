package control;

public class KimYoungOh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if for(while) break, continue
		// 생각 -> 코드.
		// 책이 500페이지이상일때 하루에 1~20페이지를 읽는다. 50일동안 몇페이지를 읽었는가.
		int a;
		int b = 50;
		int c = 0;
		int sum=0;
		for (int i = 0; i <= b; i++) {
			c = (int) (Math.random() * 20) + 1;			
				sum+=c;
			if (c >= 500) {
				
				break;
			}System.out.printf("%d 일동안 읽은 책페이지: %d ", i, sum);
			System.out.println();
		}
		
	}
}
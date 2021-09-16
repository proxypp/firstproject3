package reference;

import java.util.Scanner;

public class AryExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int scores = sc.nextInt();
		
		int [] arry = new int[scores];
		
		
		int max = 0;
		int min = arry[0];
		for(int i=0; i<arry.length; i++) {
			arry[i] = sc.nextInt();
			
			if (max < arry[i]) {
				max = arry[i];
			}
			arry[i]=arry[0];
			if(min > arry[i]) {
				min=arry[i];
				
			}
			
			
		}
		System.out.print(max+" " );		
		System.out.println(+min);
	}

}

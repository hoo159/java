package controlStmtif;

import java.util.Scanner;

public class CtrlifElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("�⵵ :  ");
		year = sc.nextInt();
		//4�� ����̰� 100�� ����� �ƴϰ� 400�� ����̸� ����
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println(year+"���� ����(leap year)�Դϴ�.");
		else
			System.out.println(year+"���� ���(common year)�Դϴ�");
		sc.close();

	}

}

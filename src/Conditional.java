package operator;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("ù ��° ���� : ");
		a= sc.nextInt();
		System.out.println("�� ��° ���� : ");
		b= sc.nextInt();
		
		
		
		System.out.printf("(%d < %d)?1:2 => %d",a,b,((a<b)?1:2));
		//���� ������ ?: => (���ǽ�)?true:false
		
		
		
		
		
		sc.close();
	}

}

package operator;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int a,b;
			System.out.println("ù ��° ���� : ");
			a= sc.nextInt();
			System.out.println("�� ��° ���� : ");
			b= sc.nextInt();

			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println(a+"*"+b+"="+(a*b));
			System.out.println(a+"/"+b+"="+((double)a/b));
			System.out.println(a+"%"+b+"="+(a%b));
			sc.close();
	}
	

}

import java.util.Scanner;

public class CtrlWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int n;
				System.out.print("양의 정수 : ");
				n= sc.nextInt();
				int i;
				
				i = 1;
				while(i<=n)
					System.out.println(i);
				i++;
	}

}

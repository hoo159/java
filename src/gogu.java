import java.util.Scanner;

public class gogu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("´Ü : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i <10; i++) {
			System.out.printf("%2d X %2d = %2d\n", dan, i, dan = i);
		}

	}

}

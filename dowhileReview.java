package review;

public class dowhileReview {

	public static void main(String[] args) {
		char a = '0';
		
		do {
			System.out.print(a);
			a = (char)(a+1);
	}
		while(a <= '9');
	}
	}
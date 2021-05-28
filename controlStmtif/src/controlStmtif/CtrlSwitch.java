package controlStmtif;

public class CtrlSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("성적 : ");
		score= sc.nextInt();
		
		switch(score/10)
		{
		case 10:
		case 9:
				System.out.println("당신의 등급은(grade)은 A 입니다."); break;
		case 8:
			System.out.println("당신의 등급은(grade)은 B 입니다."); break;
		case 7:
			System.out.println("당신의 등급은(grade)은 C 입니다."); break;
		case 6:
			System.out.println("당신의 등급은(grade)은 D 입니다."); break;
		default
			System.out.println("당신의 등급은(grade)은 F 입니다."); break;
		}
	}

}

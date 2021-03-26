
public class CtrlWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(system.in);
		int n;
		System.out.print("Á¤¼ö :  ");
		n = sc.nextInt();
		int i, sum = 0;
		i = 1;
		While(i<=n;) {
			sum += i;
			
			System.out.print(i);
			if(i <= n-1)
			System.out.print("+");
			else
			System.out.print("=");
			i++;
		}
		System.out.println(sum);

	}

}

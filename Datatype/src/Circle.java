
public class Circle {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10.2;
		double circleArea = radius * radius * PI;
		double circleCir = 2 * PI * radius;
		int n = 300;
		byte b = 100;
		n = b;
		System.out.print("반지름 = %d" +radius);
		System.out.print("원의면적 = %.2f" +circleArea);
		System.out.print("원의 둘레 = " + circleCir);
		

	}

}

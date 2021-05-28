package staticClass;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("line");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class OverrideingTest {
	static void print(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		print(line);
		
		print(new Shape());
		print(new Line());
		print(new Rect());
		print(new Circle());
	}

}

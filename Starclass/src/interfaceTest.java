package staticClass;
class Calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SamsungPhone extends Calcuimplements PhoneInterface{
	public void sendCall() {
		System.out.println("따르르르릉");
	}
	public void receiveCall() {
		System.out.println("여보세요!!");
	}
	public void flash() {
		System.out.println("휴대폰 불이 켜졌습니다.");
	}
}
public class interfaceTest {
	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
		s.receiveCall();
		s.flash();

	}

}

package staticClass;
class Calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SamsungPhone extends Calcuimplements PhoneInterface{
	public void sendCall() {
		System.out.println("����������");
	}
	public void receiveCall() {
		System.out.println("��������!!");
	}
	public void flash() {
		System.out.println("�޴��� ���� �������ϴ�.");
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

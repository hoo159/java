package operator;

public class Shift {

	public static void main(String[] args) {
	
		int a= 12, b=-8;

		System.out.printf("%d << %d = %d\n",a,2,(a << 2));
		//2^n ���� ���� ���
		System.out.printf("%d >> %d = %d\n",a,2,(a >> 2));
		//2^n ���� ���� ���
		System.out.printf("%d >> %d = %d\n",b,2,(b >> 2));
		//���������� ����Ʈ �� �ֻ��� ��Ʈ�� ������ ä�� 
		System.out.printf("%d >>> %d = %d\n",b,2,(b >>> 2));
		//���������� ����Ʈ �� ������ 0���� ä�� 
		
		
	}
	

}

package ex;

/*
 * ���� �ε� vs ���� ���̵�
 * 
 * ���� ���̵� : ��ӽ� �θ� �޼ҵ��� ������ 
 * ���� �ε� : ���� �̸������� �Ű������� ���� �ٸ� ����
 * 
 */
public class ex9_overloading2 {
	void A() {
		System.out.println("void A()");
		
	}
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	void A(String str) {
		System.out.println("void A(String str)");
	}
	//���� ���ϰ��� ������ ���� �ʴ´�. -> �Ű������� �����ε� ����
	/*int A(int arg1) {
		
	}*/
	//���� ���� ������ �Ű����� ����
	/*void A(int arg2) {
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex9_overloading2 od = new ex9_overloading2();
		od.A();
		od.A(1);
		od.A("hello");
	}

}

package ex;

public class ex4_scope03 {
	/*
	 * lexical scope, static scope (gloabal variable)
	 * dynamic scope (local variable)
	 */

	static int i =5;
	static void a() {
		int i=10;
		b();
	}
	static void b() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		
		//a�� i�� a������ ��ȿ�� ���������̳� b()������ i�� ����ΰ� ���� ������ ���������μ��� ��ȿ������ ������.
	}

}

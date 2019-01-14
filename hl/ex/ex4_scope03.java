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
		
		//a의 i는 a에서만 유효한 지역변수이나 b()에서의 i는 선언부가 없기 때문에 전역변수로서의 유효범위를 가진다.
	}

}

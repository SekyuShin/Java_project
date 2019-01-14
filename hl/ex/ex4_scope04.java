package ex;

class C {
	int v =10;
	void m() {
		int v =20;
		System.out.println(v);
		System.out.println(this.v);
	}
}



public class ex4_scope04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.m();
		
	}

}
/*
 * 유효점위란 전역변수, 지역변수 나눠서 좀 더 관리하기 편리하도록 한 것이다.
 * 절차 지향 프로그래밍에서는 모든 메소드에서 접근이 가능한 변수의 사용을 죄악시 하는 경향이 있다. -> 오류 발생 확률 증가
 * 객체지향 프로그램에서는 금기시 하지는 않는다.전역변수의 범위를 제한 할수 있기 때문에
 */

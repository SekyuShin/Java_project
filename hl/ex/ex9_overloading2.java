package ex;

/*
 * 오버 로딩 vs 오버 라이딩
 * 
 * 오버 라이딩 : 상속시 부모 메소드의 수정시 
 * 오버 로딩 : 같은 이름이지만 매개변수에 따른 다른 동작
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
	//오류 리턴값은 영향을 받지 않는다. -> 매개변수만 오버로딩 가능
	/*int A(int arg1) {
		
	}*/
	//오류 같은 형태의 매개변수 오류
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

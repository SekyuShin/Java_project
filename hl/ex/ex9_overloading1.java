package ex;
/*
 * 같은 메소드 이름이지만 매개변수의 변화로 인해 다른 기능을 할수 있게끔 만드는 것이 오버로딩
 * 오버로딩의 규칙
 *  매개변수가 다르면 이름이 같아도 서로 다른 메소드가 된다 
 *  단, 매개변수는 같지만 리턴 타입이 다르면 오류가 발생한다.
 */
class cal_overloading {
	int a,b;
	int c;
	public void setOperands() {}
	public void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.printf("a = %d, b = %d\n",a,b);
	}
	public void setOperands(int a,int b,int c) {
		this.setOperands(a,b);
		this.c = c;
		System.out.printf("a = %d, b = %d, c = %d\n",a,b,c);
	}
	
	
	
}

public class ex9_overloading1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}

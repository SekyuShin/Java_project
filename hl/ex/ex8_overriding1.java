package ex;


/* 
 * 오버라이딩의 조건
 * 1. 메소드 이름
 * 2. 메소드 매개변수의 숫자와 데이터 타입 그리고 순서
 * 3. 메소드의 리턴 타입
 * 	-> 메소드의 형태를 정의하는 사항들을 통털어서 메소드의 서명(signature)라고 하낟.
 */


class SubCal2 extends cal {
	public void sum() { //overriding sum() method
		System.out.println("실행 결과는 :"+(super.left+super.right));
	}
	public void sub() {
		System.out.println(super.left-super.right);
	}
	/*public double avg() { //부모 메소드의 타입이 다르기 때문에 에러 발생
		return (super.left+super.right)/2;
	}*/
	//-> 해결 방법 : 부모의 메소드의 return 타입을 바꾸어 준다.
	// 중복 피하기(부모의 메소드와 자식의 메소드의 중복 피하기 -> 유지 보수가 힘들기 때문에)
	// super.avg();
	//-> 그래서 나온것이 overloading
	
	
}

public class ex8_overriding1 {
	/*
	 * 오버라이딩 상속과 깊은 연관이 있다.
	 * 상속은 부모클래스의 변수나 메소드를 자식클래스가 사용할수 있고, 자식클래스는 변수나 메소드를 추가할수 있다.
	 * 이때, 부모 클래스의 메소드를 바꿀 필요가 있을때, 재정의를 할수 있다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCal2 c = new SubCal2();
		c.insert(3,5);
		c.sum();
		c.sub();
	}

}

package ex;

public class ex4_possible_range {

	/*
	 * 유효 범위
	 * 변수와 메소드 같은 것들을 사용할수 있는 것은 이름이 있기 때문이다.
	 * 프로그램이 커지면 여러 가지 이유로 이름이 충돌하게 된다. 이를 해결하기 위해서 고안된 것이 유효범위라는 개념이다. 흔히 스코프(Scope)라고 한다.
	 */
	static void a() {
		int i=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0;i<5;i++) {
			a(); //메소드를 실행시켜도 a의 i는 main 의 i와는 전혀 다른 변수이다. 이것이 바로 유효범위의 장점이다.(충돌의 방지)
			System.out.println(i);
		}
	}

}

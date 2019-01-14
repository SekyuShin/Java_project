package ex;

public class ex4_scope01 {
/*
 * 다양한 유효범위들
 * 디렉터리를 생각해보아라. 디렉터리 내에서는 파일명 중복이 안되지만 디렉터리 밖의 파일명과는 중복이 돼도 문제가 없다.
 * 
 */
	
	//전역변수를 잘못 사용한 예시, 의도치 않은 무한 루프에 걸린다.
	static int i; //전역변수(global)
	static void a() {
		i=0; //해결책 int i; -> a() 메소드 내에서만 유효한 지역 변수
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(i=0;i<5;i++) { //해결책 int i; -> 지역변수로 선언한 것 (for구문 안에서만 유효한 지역변수)  
			a();
			System.out.println(i);
		}
	}

}


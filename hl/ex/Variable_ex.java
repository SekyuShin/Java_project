package ex;

public class Variable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1; //정수 변수
		double b =1.1; //실수 변수
		String str = "hellop"; // 문자열 변수
		float c = 2.2F; //실수 변수
		long d = 212L;
		//int e = 2147483648;
		// 데이터 허용범위의 초과로 인한 오류
		byte e =100;
		short f = 200;
		//byte 와 short 는 명시적으로 int 타입에 허용된다.
		
		//자바는 변수의 데이터형을 엄격히 구분해야한다.
		System.out.println(a+1);
		System.out.println(b+1);
		System.out.println(str+"wow");
		System.out.println(e);
	}

}

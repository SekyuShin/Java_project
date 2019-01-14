package ex;

public class ex4_scope02 {
	
	static void a() {
		String title = "coding everybody";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		//System.out.println(title); //오류 발생 title은 a() 메소드에서만 유호한 지역변수
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		//System.out.println(i); //i의 유효범위는 for구문 내에서만 유효하다.

	}

}

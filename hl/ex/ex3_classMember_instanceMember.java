package ex;

public class ex3_classMember_instanceMember {
	/*
	 * 클래스(설계도)-1개 -> 인스턴스(객체) - 여러개
	 * 멤버 : 구성원(변수, 메소드)
	 * 즉, 클래스 멤버(공통된 변수(모든 인스턴스에서)), 인스턴스 멤버(각각의 인스턴스마다 다른 값을 가진다)
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		
		System.out.println(Calculator1.PI); // 클래스 변수는 정의 없이 사용 가능
		
		
		
		
		
		c1.setOperands(10,20);
		c1.sum();
		c2.setOperands(30,40);
		c2.sum();
		
		c1.base = 10; // static 이기 떄문에 공유된다. 즉, c1.base == c2.base == Calculator.base
		
		c1.sum();
		c2.sum();
		
		/*
		 * 클래스 변수의 용도 정리
		 * 1. 인스턴스에 따라서 변하지 않는 값이 필요한 경우( 위의 예에서는 PI)
		 * 2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우 (따로 객체를 만들지 않아도 사용 가능)
		 * 3. 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
		 */
		
		
		
		
		
	}

}

class Calculator1 {
	static double PI = 3.14; 	//클래스 변수 (모든 인스턴스가 공유하는 변수)
	static int base =0;
	int left,right;				// 인스턴스 변수 (각각의 인스턴스가 가지는 변수)- 각각 다르다.
	
	public void setOperands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right+base);
	}
	public void avg() {
		System.out.println((this.left + this.right+base)/2);
	}
}

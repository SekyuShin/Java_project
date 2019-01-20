package ex;


class MulCalculator extends Calculator4 {
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}

class DivCalculator extends MulCalculator {
	public void division () {
		System.out.println((double)this.left/this.right);
	}
}

public class ex6_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivCalculator c1 = new DivCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();

	}

}



/*
 * 상속의 장점
 * 	코드중복 제거 , 재활용성 증가, 유지 보수가 편리하다 (개선 사항 등(오버라이딩 등))
 *  부모의 클래스의 존재로 가독성 또한 높아진다.
 */
package ex;

class cal {
	int left,right;
	//상속된 클래스에 생성자를 만들기 위해서 기본 생성자를 명시적으로 만들어야한다.
	public cal() {}
	public cal(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void insert(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subCal extends cal {
	/*public subCal(int left, int right) {
		//중복된 생성자
		this.left = left;
		this.right = right;
	}*/
	//해결책
	public subCal(int left,int right) {
		super(left,right);
		//상위 클래스의 생성자
		
		//하위 클래스가 상위 클래스를 참조할수 있는 키워드 super
		//하위 클래스의 인스턴스는 상위 클래스의 인스턴스후에 진행되기 때문에 생성자를 추가하고 싶으면 super다음에 써야한다.
	}
}


public class ex7_constructor2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 생성자를 만들면, default생성자를 만들어 주지 않는다.
		// 상속 받은 클래스의 생성자를 생성할때, super클래스의 기본 생성자를 호출한다. 이때, 기본 생성자가 없으면 에러가 발생한다.
		
		
		
	}

}

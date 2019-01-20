package opentutorials.ex1;

public class ex1_Cal {
	int left,right;
	
	public void setOperands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

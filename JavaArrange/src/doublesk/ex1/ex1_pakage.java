package doublesk.ex1;
//import hl.ex.ex2_Cal; 외부 프로젝트에서는 안되는 듯 하다.
import opentutorials.ex1.ex1_Cal;

/*
 * 패키지는 폴더라고 생각 하면 된다.
 * 이름의 중복등을 피할수 있다.
 */
public class ex1_pakage {
	public static void main(String args[]) {
		ex1_Cal c = new ex1_Cal();
		c.setOperands(10,20);
		c.sum();
		c.avg();
	}
}

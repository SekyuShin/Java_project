package ex;
/*	클래스		: 설계도 (정의)
 * 	인스턴스		: 제품   (호출)
 * 	객체			: 
 */


public class ex2_class_instance_object {

	public static void sum (int a, int b) {
		System.out.println(a+b);
	}
	public static void avg (int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그래밍 중요점 : 중복의 제거 (재활용성 활용) -> 메소드 사용
		// refactoring : 동일 하게 동작하지만, 코드의 내용을 개선하여 효율적으로 개선하는 과정
		sum(10,20); //System.out.println(10+20);
		sum(30,40); //System.out.println(30+40);
		// 가독성 증가, 효율적인 유지및 보수 가능 등
		
		//문제점
		int left, right;
		//1번 그룹
		left = 10;
		right = 20;
		//추가 로직
		sum(left,right);
		avg(left,right);
		//2번그룹
		left = 30;
		right = 40;
		//추가 로직
		sum(left,right);
		avg(left,right);
		//-> 문제발생 : 여러사람이 같이 개발하기 떄문에 추가 로직에의한 변환이 생길수 있다.
		// -> 변수의 접두사 추가 등의 규율
		// -> 연관되어 있는 데이터와 연산을 그룹핑 할수 없을까? -> 객체지향 언어의 배경 (선택적으로 사용도 가능)
		
		
		// 해결책 객체의 생성
		
		ex2_Cal c1 = new ex2_Cal(); //인스턴스
		c1.setOperands(10,20);
		c1.sum();
		
		ex2_Cal c2 = new ex2_Cal();
		c2.setOperands(30,40);
		c2.sum();
		c2.avg();
		
		// 그룹화 시켜서 연관성 있는 정보들끼리 묶음 -> 직관적으로 정보를 알수 있으며, 유지및 보수가 편해짐
		
		
		
	}

}

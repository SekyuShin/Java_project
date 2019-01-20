package ex;

/*
 * 상속이란?
 * 객체지향을 통해서 달성하고자 하는 목표 중에서 가장 중요한 것은 재활용성일 것이다. -> 상속 but 객체지향을 복잡하게 하는 주요 원인
 * 
 */
class Calculator4 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator4 {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
/*
 * 객체를 자신이 만들지 않아서 소스를 변경할 수 없다. 또한 변경한다고 하더라도, 업데이트시 만든 메소드가 사라질 수 있다.
 * 또한, 객체가 다양한 곳엣 활용되고 있는데 메소드를 추가하면 다른 곳에서는 불필요한 기능이 포함 될수 있다.
 * 그래서 상속을 쓴다.
 */
 
public class ex6_Inheritance1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}


package ex;


class Calculator3{
	  
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class ex3_classMethod {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20); //객체 생성할 필요없이 바로 사용 가능함
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
        
        //변수가 같은 상태를 유지할 필요가 없을때, 사용하기 용이하다.-> 1회용
    }
 
}
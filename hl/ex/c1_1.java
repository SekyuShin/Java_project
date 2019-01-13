package ex;

import java.util.Scanner;

public class c1_1 {
	public static void main(String[] args) {
		hello h1= new hello();
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		h1.Show();
		a = sc.nextInt();
		b= sc.nextInt();
		h1.change(a, b);
		h1.Show();
		
		
	}
}

class hello {
	private int a;
	private int b;
	private int sum;
	
	hello(int a) {
		this.a = a;
	}
	hello(int a,int b) {
		this.a = a;
		this.b = b;
		sum=a+b;
	}
	public hello() {}
	
	public void Show() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("sum="+sum);
	}
	public void change(int a,int b) {
		this.a = a;
		this.b = b;
		sum = a+b;
	}
}

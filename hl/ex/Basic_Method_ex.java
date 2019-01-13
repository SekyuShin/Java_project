package ex;

public class Basic_Method_ex {
	public static void numbering() {
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}
	}
	
	public static void numbering2(int init,int limit) {
		
		for(int i =init;i<limit;i++) {
			System.out.println(i);
		}
	}
	public static String numbering3(int init,int limit) {
		String output ="";
		for(int i =init;i<limit;i++) {
			output +=i;
		}
		return output;
	}
	public static int Add(int init, int limit) {
		int sum = 0;
		for(int i=init;i<limit+1;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numbering3(1,5));
		System.out.println(Add(2,5));
	}

}

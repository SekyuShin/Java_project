package ex;

public class TypeConversion_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dv = 3.14;
		float fv = 1.23F;
		//자동형변형
		int a = 3;
		float b = 1.0F;
		double c = a+b; //두번의 형변형 int-> float->double
		dv = fv; //데이터 타입이 double 크기 떄문에 가능
		//fv = dv; 데이터 타입이 float가 더 작기 떄문에 불가
		//즉, 자동형변형시 좁은 데이터-> 넓은 데이터 타입의 변형만 허용됨
		//byte < short,char < int < long < float < double
		
		
		//강제 형변형(명시적 형변형)
		fv = (float)dv;
	
	}

}

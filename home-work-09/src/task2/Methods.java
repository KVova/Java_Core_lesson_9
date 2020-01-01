package task2;

public class Methods {

	private int a, b;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	int add() throws MyException, IllegalAccessException{
		method();
		return a + b;
	}
	
	int subtraction() throws MyException, IllegalAccessException{
		method();
		return a - b;
	}
	
	double multiplication() throws MyException, IllegalAccessException{
		method();
		return a * b;
	}
	
	double devision() throws MyException, IllegalAccessException{
		method();
		return a / b;
	}
	
	private void method() throws MyException, IllegalAccessException{
	if(a < 0 & b < 0) {
		throw new IllegalArgumentException("a < 0 && b < 0");
	}
	
	if((a == 0 & b != 0) || (a!=0 & b == 0)) {
		throw new ArithmeticException("(a = 0 && b !=0) || (a!=0 && b = 0)");
	}
	
	if(a == 0 & b == 0) {
		throw new IllegalAccessException("a = 0 && b = 0");
	}
	
	if(a > 0 & b > 0) {
		throw new MyException("a > 0 & b > 0");
	}
	
	}
	
}

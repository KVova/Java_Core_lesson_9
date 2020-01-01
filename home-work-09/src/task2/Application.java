package task2;

public class Application {

	public static void main(String[] args) throws MyException, IllegalAccessException{
		
		Methods m = new Methods(10, 5);
		
		m.add();
		m.devision();
		m.multiplication();
		m.subtraction();
	}
	
}

package task1;

public class WrongInputConsoleParametersException extends Throwable{

	private String message;

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}
	
	
	
}

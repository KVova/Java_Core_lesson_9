package task1;

public class SeasonException extends Exception{
		
		private String enumMessage;

		public SeasonException(String enumMessage) {
			super(enumMessage);
			this.enumMessage = enumMessage;
		}
}

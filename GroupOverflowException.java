package sample;

public class GroupOverflowException extends Exception {
	
	 @Override
	    public String getMessage() {
	        return "The Group is full";
	 }

}

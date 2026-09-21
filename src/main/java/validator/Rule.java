package validator;

public interface Rule {
	
    boolean validate(String data);
    String getErrorMessage();
}
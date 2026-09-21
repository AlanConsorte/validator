package validator.rules.common;

import validator.Rule;

public final class MustContainDigitRule implements Rule {
	
	static private final
	MustContainDigitRule singleton = new MustContainDigitRule();
	
	static public 
	MustContainDigitRule create() {
		
		return singleton;
	}
	
	private MustContainDigitRule() {
		/*singleton*/
	}
	
    @Override
    public boolean validate(String data) {
    	
        return (data != null && data.matches(".*\\d.*"));
    }

    @Override
    public String getErrorMessage() {
        return "It must contain at least one digit.";
    }
}
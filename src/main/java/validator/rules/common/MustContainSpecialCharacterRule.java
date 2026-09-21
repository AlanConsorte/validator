package validator.rules.common;

import validator.Rule;

public final class MustContainSpecialCharacterRule implements Rule {
	
	static private final
	MustContainSpecialCharacterRule singleton = new MustContainSpecialCharacterRule();
	
	static public
	MustContainSpecialCharacterRule create() {
		
		return singleton;
	}
	
	private MustContainSpecialCharacterRule() {
		/*singleton*/
	}
	
    @Override
    public boolean validate(String data) {
        
    	return (data != null && data.matches(".*[^a-zA-Z0-9].*"));
    }

    @Override
    public String getErrorMessage() {
        return "It must contain at least one special character.";
    }
}

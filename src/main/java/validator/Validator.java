package validator;

import java.util.ArrayList;
import java.util.List;

public class Validator {
	
    private final List<Rule> rules;

    public Validator() {
    	
    	this.rules = new ArrayList<>();
    }
    
    public Validator(List<Rule> rules){
    
    	this.rules = rules;
    }
    
    public void clear() {
    	
    	this.rules.clear();
    }
    
    public void add(Rule rule) {
    	
    	this.rules.add(rule);
    }
    
    public void remove(Rule rule) {
    	this.rules.remove(rule);
    }

    public List<String> validate(String data) {
        
    	List<String> errors = new ArrayList<>();
        
        for (Rule rule : rules) {
            if (!rule.validate(data)) {
                errors.add(rule.getErrorMessage());
            }
        }
        
        return errors;
    }
}
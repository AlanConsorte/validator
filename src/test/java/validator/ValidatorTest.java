package validator;

import org.junit.jupiter.api.Test;

import validator.rules.common.MustContainDigitRule;
import validator.rules.common.MustContainSpecialCharacterRule;
import validator.rules.custom.MinimumLengthRule;



public class ValidatorTest {
    @Test 
    public void testValidatorWithNoRules() {
        Validator validator = new Validator();
        String data = "Test data";
        assert(validator.validate(data).isEmpty());
    }
    @Test 
    public void testValidatorWithRules() {
        Validator validator = new Validator();
        Rule rule1 = MinimumLengthRule.create();
        Rule rule2 = MustContainDigitRule.create();
        Rule rule3 = MustContainSpecialCharacterRule.create();
        validator.add(rule1);
        validator.add(rule2);
        validator.add(rule3);
        
        String data = "Test1";
        assert(validator.validate(data).size() == 1);

        
    }
}
package validator.rules.common;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import validator.Rule;

public class MustContainDigitRuleTest {

    @Test
    public void shouldReturnTrueWhenContainsDigits() {

        Rule rule = MustContainDigitRule.create();

        boolean isValid = rule.validate("Some text with digits 123");

        assertTrue(isValid, "The rule should accept a text that contains digits.");
    }
}

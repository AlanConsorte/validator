package validator.rules.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import validator.Rule;

public class MustContainDigitRuleTest {

    @Test
    public void shouldReturnFalseWhenHasNoDigits() {

        Rule rule = MustContainDigitRule.create();

        boolean isValid = rule.validate("just only letters");

        assertFalse(isValid, "The rule should reject a text with no digits.");
    }

    @Test
    public void shouldReturnFalseWhenIsEmpty() {

        Rule rule = MustContainDigitRule.create();

        boolean isValid = rule.validate("");

        assertFalse(isValid, "The rule should reject an empty text because it does not have digits.");
    }

    @Test
    public void shouldReturnFalseWhenIsNull() {

        Rule rule = MustContainDigitRule.create();

        boolean isValid = rule.validate(null);

        assertFalse(isValid, "The rule should return false if the text is null.");
    }

    @Test
    public void shouldReturnTheCorrectErrorMessage() {

        Rule rule = MustContainDigitRule.create();

        String expectedMessage = "It must contain at least one digit.";

        assertEquals(expectedMessage, rule.getErrorMessage());
    }

    @Test
    public void shouldReturnTrueWhenContainsDigits() {

        Rule rule = MustContainDigitRule.create();

        boolean isValid = rule.validate("Some text with digits 123");

        assertTrue(isValid, "The rule should accept a text that contains digits.");
    }

}

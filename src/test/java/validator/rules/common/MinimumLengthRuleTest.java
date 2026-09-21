package validator.rules.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import validator.Rule;

public class MinimumLengthRuleTest {

    @Test
    public void shouldReturnFalseWhenTextIsShorterThanMinimumLength() {

        Rule rule = MinimumLengthRule.create(5);

        boolean isValid = rule.validate("abcd");

        assertFalse(isValid, "The rule should reject a text with less than 5 characters.");
    }

    @Test
    public void shouldReturnFalseWhenIsEmpty() {

        Rule rule = MinimumLengthRule.create(5);

        boolean isValid = rule.validate("");

        assertFalse(isValid, "The rule should reject an empty text.");
    }

    @Test
    public void shouldReturnFalseWhenIsNull() {

        Rule rule = MinimumLengthRule.create(5);

        boolean isValid = rule.validate(null);

        assertFalse(isValid, "The rule should return false if the text is null.");
    }

    @Test
    public void shouldReturnTrueWhenTextHasMinimumLength() {

        Rule rule = MinimumLengthRule.create(5);

        boolean isValid = rule.validate("abcde");

        assertTrue(isValid, "The rule should accept a text with 5 characters.");
    }

    @Test
    public void shouldReturnTrueWhenTextIsLongerThanMinimumLength() {

        Rule rule = MinimumLengthRule.create(5);

        boolean isValid = rule.validate("abcdef");

        assertTrue(isValid, "The rule should accept a text with more than 5 characters.");
    }

    @Test
    public void shouldReturnTheCorrectErrorMessage() {

        Rule rule = MinimumLengthRule.create(5);

        String expectedMessage = "It must contain at least 5 characters.";

        assertEquals(expectedMessage, rule.getErrorMessage());
    }

}

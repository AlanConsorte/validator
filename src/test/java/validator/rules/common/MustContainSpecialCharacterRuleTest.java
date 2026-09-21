package validator.rules.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import validator.Rule;

public class MustContainSpecialCharacterRuleTest {

    @Test
    public void shouldReturnFalseWhenHasNoSpecialCharacters() {

        Rule rule = MustContainSpecialCharacterRule.create();

        boolean isValid = rule.validate("just only letters");

        assertFalse(isValid, "The rule should reject a text with no special characters.");
    }

    @Test
    public void shouldReturnFalseWhenIsEmpty() {

        Rule rule = MustContainSpecialCharacterRule.create();

        boolean isValid = rule.validate("");

        assertFalse(isValid, "The rule should reject an empty text.");
    }

    @Test
    public void shouldReturnFalseWhenIsNull() {

        Rule rule = MustContainSpecialCharacterRule.create();

        boolean isValid = rule.validate(null);

        assertFalse(isValid, "The rule should return false if the text is null.");
    }

    @Test
    public void shouldReturnTheCorrectErrorMessage() {

        Rule rule = MustContainSpecialCharacterRule.create();

        String expectedMessage = "It must contain at least one special character.";

        assertEquals(expectedMessage, rule.getErrorMessage());
    }

    @Test
    public void shouldReturnTrueWhenContainsSpecialCharacter() {

        Rule rule = MustContainSpecialCharacterRule.create();

        boolean isValid = rule.validate("Some text!");

        assertTrue(isValid, "The rule should accept a text that contains a special character.");
    }

}

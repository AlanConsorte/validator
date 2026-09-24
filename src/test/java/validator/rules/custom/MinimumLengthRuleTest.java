package validator.rules.custom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import validator.Rule;

public class MinimumLengthRuleTest {

    @Test
    public void shouldReturnTrueWhenInputMeetsMinimumLength() {
        Rule rule = MinimumLengthRule.create();
        boolean isValid = rule.validate("Hello");
        assertTrue(isValid,"A regra deve retornar true quando o input atende ao comprimento mínimo.");
    }

    @Test
    public void shouldReturnFalseWhenInputDoesNotMeetMinimumLength() {
        Rule rule = MinimumLengthRule.create();
        boolean isValid = rule.validate("Hi");
        assertFalse(isValid,"A regra deve retornar false quando o input não atende ao comprimento mínimo.");
    }

    @Test
    public void shouldReturnFalseWhenInputIsNull() {
        Rule rule = MinimumLengthRule.create();
        boolean isValid = rule.validate(null);
        assertFalse(isValid,"A regra deve retornar false quando o input é null.");
    }

    @Test
    public void shouldReturnFalseWhenInputIsEmpty() {
        Rule rule = MinimumLengthRule.create();
        boolean isValid = rule.validate("");
        assertFalse(isValid, "A regra deve retornar false quando o input é vazio.");
    }

    @Test
    public void shouldReturnTheCorrectErrorMessage() {
        Rule rule = MinimumLengthRule.create();
        String expectedErrorMessage = "It must be at least 8 characters long.";
        assertEquals(expectedErrorMessage, rule.getErrorMessage(), "A mensagem de erro deve corresponder à mensagem esperada.");
    }
}
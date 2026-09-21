package validator.rules.common;

import validator.Rule;

public class MinimumLengthRule implements Rule {

    private final int minimumLength;

    private MinimumLengthRule(int minimumLength) {
        this.minimumLength = minimumLength;
    }

    public static Rule create(int minimumLength) {
        return new MinimumLengthRule(minimumLength);
    }

    @Override
    public boolean validate(String value) {
        if (value == null) {
            return false;
        }

        return value.length() >= minimumLength;
    }

    @Override
    public String getErrorMessage() {
        return "It must contain at least " + minimumLength + " characters.";
    }
}
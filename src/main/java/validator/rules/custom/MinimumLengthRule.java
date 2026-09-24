package validator.rules.custom;

import validator.Rule;

public final class MinimumLengthRule implements Rule {

    private final int MINIMUM;

    static private final MinimumLengthRule singleton = new MinimumLengthRule();

    static public MinimumLengthRule create() {

        return singleton;
    }

    public MinimumLengthRule() {

        MINIMUM = 4;
    }

    public MinimumLengthRule(int min) {

        MINIMUM = min;
    }

    @Override
    public boolean validate(String data) {

        return (data != null && data.length() >= MINIMUM);
    }

    @Override
    public String getErrorMessage() {

        return "It must be at least 8 characters long.";
    }
}
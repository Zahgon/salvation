package com.shapesecurity.salvation2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Directive {

    private static final Pattern DIRECTIVE_NAME_PATTERN = Pattern.compile("^[A-Za-z0-9\\-]+$");

    public static Predicate<String> IS_DIRECTIVE_NAME = s -> DIRECTIVE_NAME_PATTERN.matcher(s).matches();

    private static final Pattern NON_DIRECTIVE_CHAR_PATTERN = Pattern.compile("[" + Constants.WHITESPACE_CHARS + ",;]");

    public static Predicate<String> containsNonDirectiveCharacter = s -> NON_DIRECTIVE_CHAR_PATTERN.matcher(s).matches();

    protected List<String> values;

    protected static DirectiveErrorConsumer wrapManipulationErrorConsumer(ManipulationErrorConsumer errors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void addValue(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Directive(List<String> values) {
        this.values = new ArrayList<>();
        for (String value : values) {
            // We use this API so we get the validity checks
            this.addValue(value);
        }
    }

    protected void removeValueIgnoreCase(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @FunctionalInterface
    public interface DirectiveErrorConsumer {

        // index = -1 for errors not pertaining to a value
        void add(Policy.Severity severity, String message, int valueIndex);

        DirectiveErrorConsumer ignored = (severity, message, valueIndex) -> {
        };
    }

    @FunctionalInterface
    public interface ManipulationErrorConsumer {

        void add(Severity severity, String message);

        ManipulationErrorConsumer ignored = (severity, message) -> {
        };

        // Info: strictly informative
        // Warning: it matches the grammar, but is meaningless, duplicated, or otherwise problematic
        enum Severity {

            Info, Warning
        }
    }
}

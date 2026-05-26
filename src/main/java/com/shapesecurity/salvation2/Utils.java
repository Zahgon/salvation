package com.shapesecurity.salvation2;

import javax.annotation.Nonnull;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Utils {

    private static final Pattern BASE64_PATTERN = Pattern.compile("[a-zA-Z0-9+/\\-_]+=?=?");

    public static final Predicate<String> IS_BASE64_VALUE = s -> BASE64_PATTERN.matcher(s).matches();

    // https://infra.spec.whatwg.org/#split-on-ascii-whitespace
    static List<String> splitOnAsciiWhitespace(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://infra.spec.whatwg.org/#strictly-split
    static List<String> strictlySplit(@Nonnull String s, char delim) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static String decodeString(@Nonnull String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Utils() {
        // Utility class
    }
}

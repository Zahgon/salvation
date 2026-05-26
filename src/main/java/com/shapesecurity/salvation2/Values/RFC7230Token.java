package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Constants;
import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;

public class RFC7230Token {

    @Nonnull
    public final String value;

    private RFC7230Token(@Nonnull String value) {
        this.value = value;
    }

    public static Optional<RFC7230Token> parseRFC7230Token(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

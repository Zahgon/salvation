package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Constants;
import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class Scheme {

    @Nonnull
    public final String value;

    private Scheme(@Nonnull String value) {
        this.value = value;
    }

    public static Optional<Scheme> parseScheme(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
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
}

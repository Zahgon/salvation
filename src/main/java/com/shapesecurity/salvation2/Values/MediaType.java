package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Constants;
import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;

public class MediaType {

    @Nonnull
    public final String type;

    @Nonnull
    public final String subtype;

    private MediaType(String type, String subtype) {
        this.type = type;
        this.subtype = subtype;
    }

    public static Optional<MediaType> parseMediaType(String value) {
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

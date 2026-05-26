package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Utils;
import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class Nonce {

    @Nonnull
    public final String base64ValuePart;

    private Nonce(@Nonnull String base64Valuepart) {
        this.base64ValuePart = base64Valuepart;
    }

    public static Optional<Nonce> parseNonce(String value) {
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

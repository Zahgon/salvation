package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Utils;
import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class Hash {

    @Nonnull
    public final Algorithm algorithm;

    @Nonnull
    public final String base64ValuePart;

    private Hash(Algorithm algorithm, String base64ValuePart) {
        this.algorithm = algorithm;
        this.base64ValuePart = base64ValuePart;
    }

    public static Optional<Hash> parseHash(String value) {
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

    public enum Algorithm {

        SHA256("sha256", 44), SHA384("sha384", 64), SHA512("sha512", 88);

        @Nonnull
        private final String value;

        @Nonnull
        public final int length;

        Algorithm(@Nonnull String value, int length) {
            this.value = value;
            this.length = length;
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}

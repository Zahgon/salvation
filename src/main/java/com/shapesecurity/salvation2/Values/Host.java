package com.shapesecurity.salvation2.Values;

import com.shapesecurity.salvation2.Constants;
import com.shapesecurity.salvation2.URLs.URI;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;

public class Host {

    @Nullable
    public final String scheme;

    @Nonnull
    public final String host;

    public final int port;

    @Nullable
    public final String path;

    public static final Host STAR = new Host(null, "*", Constants.EMPTY_PORT, null);

    private Host(String scheme, String host, int port, String path) {
        this.scheme = scheme;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public static Optional<Host> parseHost(String value) {
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

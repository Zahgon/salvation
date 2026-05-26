package com.shapesecurity.salvation2.URLs;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;

public abstract class URLWithScheme {

    @Nonnull
    public final String scheme;

    @Nullable
    public final String host;

    @Nullable
    public final Integer port;

    @Nonnull
    public final String path;

    protected URLWithScheme(@Nonnull String scheme, @Nullable String host, @Nullable Integer port, @Nonnull String path) {
        this.scheme = scheme.toLowerCase(Locale.ENGLISH);
        this.host = host == null ? host : host.toLowerCase(Locale.ENGLISH);
        this.port = port;
        this.path = path;
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

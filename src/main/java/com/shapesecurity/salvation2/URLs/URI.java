package com.shapesecurity.salvation2.URLs;

import com.shapesecurity.salvation2.Constants;
import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;

public class URI extends URLWithScheme {

    public URI(@Nonnull String scheme, @Nonnull String host, int port, @Nonnull String path) {
        super(scheme, host, port, path);
    }

    @Nonnull
    public static Optional<URI> parseURI(@Nonnull String uri) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // http://www.w3.org/TR/url/#default-port
    public static int defaultPortForProtocol(@Nonnull String scheme) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

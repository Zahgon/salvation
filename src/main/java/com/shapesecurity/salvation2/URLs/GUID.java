package com.shapesecurity.salvation2.URLs;

import com.shapesecurity.salvation2.Constants;
import javax.annotation.Nonnull;
import java.util.Optional;
import java.util.regex.Matcher;

public class GUID extends URLWithScheme {

    // See https://url.spec.whatwg.org/#example-url-components
    public GUID(@Nonnull String scheme, @Nonnull String value) {
        super(scheme, null, null, value);
    }

    public static Optional<GUID> parseGUID(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

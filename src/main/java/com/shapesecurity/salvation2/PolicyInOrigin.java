package com.shapesecurity.salvation2;

import com.shapesecurity.salvation2.URLs.URLWithScheme;
import java.util.Optional;

public class PolicyInOrigin {

    public final Policy policy;

    public final URLWithScheme origin;

    public PolicyInOrigin(Policy policy, URLWithScheme origin) {
        this.policy = policy;
        this.origin = origin;
    }

    // Low-level querying
    public boolean allowsScriptFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsStyleFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsImageFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFrameFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsWorkerFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFontFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsObjectFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsMediaFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsManifestFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsPrefetchFromSource(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsUnsafeInlineScript() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsUnsafeInlineStyle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsConnection(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsNavigation(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFrameAncestor(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFormAction(URLWithScheme url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

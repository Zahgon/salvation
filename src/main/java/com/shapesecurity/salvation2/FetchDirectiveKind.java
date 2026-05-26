package com.shapesecurity.salvation2;

public enum FetchDirectiveKind {

    ChildSrc("child-src"),
    ConnectSrc("connect-src"),
    DefaultSrc("default-src"),
    FontSrc("font-src"),
    FrameSrc("frame-src"),
    ImgSrc("img-src"),
    ManifestSrc("manifest-src"),
    MediaSrc("media-src"),
    ObjectSrc("object-src"),
    PrefetchSrc("prefetch-src"),
    ScriptSrcAttr("script-src-attr"),
    ScriptSrc("script-src"),
    ScriptSrcElem("script-src-elem"),
    StyleSrcAttr("style-src-attr"),
    StyleSrc("style-src"),
    StyleSrcElem("style-src-elem"),
    WorkerSrc("worker-src");

    public final String repr;

    FetchDirectiveKind(String repr) {
        this.repr = repr;
    }

    // returns null if not matched
    public static FetchDirectiveKind fromString(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#directive-fallback-list
    // Note the oddity that worker-src falls back to child-src then script-src then directive-src, but frame-src falls back to child-src then directly default-src
    // Also note that `script-src` falls back to `default-src` for "unsafe-eval", but this is done manually in prose rather than in this table (in https://w3c.github.io/webappsec-csp/#can-compile-strings )
    // It is included here only for completeness
    private static FetchDirectiveKind[] ScriptSrcFallback = new FetchDirectiveKind[] { ScriptSrc, DefaultSrc };

    private static FetchDirectiveKind[] ScriptSrcElemFallback = new FetchDirectiveKind[] { ScriptSrcElem, ScriptSrc, DefaultSrc };

    private static FetchDirectiveKind[] ScriptSrcAttrFallback = new FetchDirectiveKind[] { ScriptSrcAttr, ScriptSrc, DefaultSrc };

    private static FetchDirectiveKind[] StyleSrcFallback = new FetchDirectiveKind[] { StyleSrc, DefaultSrc };

    private static FetchDirectiveKind[] StyleSrcElemFallback = new FetchDirectiveKind[] { StyleSrcElem, StyleSrc, DefaultSrc };

    private static FetchDirectiveKind[] StyleSrcAttrFallback = new FetchDirectiveKind[] { StyleSrcAttr, StyleSrc, DefaultSrc };

    private static FetchDirectiveKind[] WorkerSrcFallback = new FetchDirectiveKind[] { WorkerSrc, ChildSrc, ScriptSrc, DefaultSrc };

    private static FetchDirectiveKind[] ConnectSrcFallback = new FetchDirectiveKind[] { ConnectSrc, DefaultSrc };

    private static FetchDirectiveKind[] ManifestSrcFallback = new FetchDirectiveKind[] { ManifestSrc, DefaultSrc };

    private static FetchDirectiveKind[] PrefetchSrcFallback = new FetchDirectiveKind[] { PrefetchSrc, DefaultSrc };

    private static FetchDirectiveKind[] ObjectSrcFallback = new FetchDirectiveKind[] { ObjectSrc, DefaultSrc };

    private static FetchDirectiveKind[] FrameSrcFallback = new FetchDirectiveKind[] { FrameSrc, ChildSrc, DefaultSrc };

    private static FetchDirectiveKind[] MediaSrcFallback = new FetchDirectiveKind[] { MediaSrc, DefaultSrc };

    private static FetchDirectiveKind[] FontSrcFallback = new FetchDirectiveKind[] { FontSrc, DefaultSrc };

    private static FetchDirectiveKind[] ImgSrcFallback = new FetchDirectiveKind[] { ImgSrc, DefaultSrc };

    static FetchDirectiveKind[] getFetchDirectiveFallbackList(FetchDirectiveKind directive) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

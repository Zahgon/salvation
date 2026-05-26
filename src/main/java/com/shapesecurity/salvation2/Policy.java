package com.shapesecurity.salvation2;

import com.shapesecurity.salvation2.Directives.FrameAncestorsDirective;
import com.shapesecurity.salvation2.Directives.HostSourceDirective;
import com.shapesecurity.salvation2.Directives.PluginTypesDirective;
import com.shapesecurity.salvation2.Directives.ReportUriDirective;
import com.shapesecurity.salvation2.Directives.SandboxDirective;
import com.shapesecurity.salvation2.Directives.SourceExpressionDirective;
import com.shapesecurity.salvation2.URLs.GUID;
import com.shapesecurity.salvation2.URLs.URI;
import com.shapesecurity.salvation2.URLs.URLWithScheme;
import com.shapesecurity.salvation2.Values.Hash;
import com.shapesecurity.salvation2.Values.Host;
import com.shapesecurity.salvation2.Values.MediaType;
import com.shapesecurity.salvation2.Values.RFC7230Token;
import com.shapesecurity.salvation2.Values.Scheme;
import javax.annotation.Nonnull;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Policy {

    // Things we don't preserve:
    // - Whitespace
    // - Empty directives or policies (as in `; ;` or `, ,`)
    // Things we do preserve:
    // - Source-expression lists being genuinely empty vs consisting of 'none'
    // - Case (as in lowercase vs uppercase)
    // - Order
    // - Duplicate directives
    // - Unrecognized directives
    // - Values in directives which forbid them
    // - Duplicate values
    // - Unrecognized values
    private List<NamedDirective> directives = new ArrayList<>();

    private SourceExpressionDirective baseUri = null;

    private boolean blockAllMixedContent = false;

    private SourceExpressionDirective formAction = null;

    private FrameAncestorsDirective frameAncestors = null;

    private SourceExpressionDirective navigateTo = null;

    private PluginTypesDirective pluginTypes;

    private RFC7230Token reportTo;

    private ReportUriDirective reportUri;

    private SandboxDirective sandbox = null;

    private boolean upgradeInsecureRequests = false;

    @Nonnull
    private final EnumMap<FetchDirectiveKind, SourceExpressionDirective> fetchDirectives = new EnumMap<>(FetchDirectiveKind.class);

    private Policy() {
        // pass
    }

    // https://w3c.github.io/webappsec-csp/#parse-serialized-policy-list
    @Nonnull
    public static PolicyList parseSerializedCSPList(String serialized, PolicyListErrorConsumer policyListErrorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#parse-serialized-policy
    @Nonnull
    public static Policy parseSerializedCSP(String serialized, PolicyErrorConsumer policyErrorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Manipulation APIs
    // We do not provide a generic method for updating an existing directive in-place. Just remove the existing one and add it back.
    public Directive add(String name, List<String> values, Directive.DirectiveErrorConsumer directiveErrorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Note that this removes all directives matching this name.
    // Returns true if at least one directive was removed.
    public boolean remove(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Accessors
    public Optional<SourceExpressionDirective> baseUri() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean blockAllMixedContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBlockAllMixedContent(boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SourceExpressionDirective> formAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<FrameAncestorsDirective> frameAncestors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SourceExpressionDirective> navigateTo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<PluginTypesDirective> pluginTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<RFC7230Token> reportTo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setReportTo(RFC7230Token token) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<ReportUriDirective> reportUri() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SandboxDirective> sandbox() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean upgradeInsecureRequests() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUpgradeInsecureRequests(boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SourceExpressionDirective> getFetchDirective(FetchDirectiveKind kind) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // High-level querying
    /*
	For each of these arguments, if the value provided is Optional.empty(), this method will return `true` only if there is no value for the Optional.of() case of that parameter which would cause it to return `false`.
	Take care with `integrity`; your script can be allowed by CSP but blocked by SRI if its integrity is wrong.
	See https://www.w3.org/TR/SRI/
	Also note that the notion of "the URL" is a little fuzzy because there can be redirects.
	https://w3c.github.io/webappsec-csp/#script-pre-request
	https://w3c.github.io/webappsec-csp/#script-post-request
	 */
    public boolean allowsExternalScript(Optional<String> nonce, Optional<String> integrity, Optional<URLWithScheme> scriptUrl, Optional<Boolean> parserInserted, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#script-src-elem-inline
    public boolean allowsInlineScript(Optional<String> nonce, Optional<String> source, Optional<Boolean> parserInserted) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#script-src-attr-inline
    public boolean allowsScriptAsAttribute(Optional<String> source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#can-compile-strings
    public boolean allowsEval() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#navigate-to-pre-navigate
    // https://w3c.github.io/webappsec-csp/#navigate-to-navigation-response
    // Strictly speaking this requires the _response_'s CSP as well, because of frame-ancestors.
    // But we are maybe not going to worry about that.
    // Note: it is nonsensical to provide redirectedTo if redirected is Optional.of(false)
    // Note: this also does not handle `javascript:` navigation; there's an explicit API for that
    public boolean allowsNavigation(Optional<URLWithScheme> to, Optional<Boolean> redirected, Optional<URLWithScheme> redirectedTo, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#navigate-to-pre-navigate
    // https://w3c.github.io/webappsec-csp/#navigate-to-navigation-response
    // Note: it is nonsensical to provide redirectedTo if redirected is Optional.of(false)
    public boolean allowsFormAction(Optional<URLWithScheme> to, Optional<Boolean> redirected, Optional<URLWithScheme> redirectedTo, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // NB: the hashes (for unsafe-hashes) are supposed to include the javascript: part, per spec
    public boolean allowsJavascriptUrlNavigation(Optional<String> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsExternalStyle(Optional<String> nonce, Optional<URLWithScheme> styleUrl, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsInlineStyle(Optional<String> nonce, Optional<String> source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsStyleAsAttribute(Optional<String> source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFrame(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFrameAncestor(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // This assumes that a `ws:` or `wss:` URL is being used with `new WebSocket` specifically
    public boolean allowsConnection(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsFont(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsImage(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsApplicationManifest(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsMedia(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsObject(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Not actually spec'd properly; see https://github.com/whatwg/fetch/issues/1008
    public boolean allowsPrefetch(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsWorker(Optional<URLWithScheme> source, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowsPlugin(Optional<MediaType> mediaType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#should-directive-execute
    public Optional<SourceExpressionDirective> getGoverningDirectiveForEffectiveDirective(FetchDirectiveKind kind) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#directive-inline-check
    // https://w3c.github.io/webappsec-csp/#should-block-inline specifies the first four values
    // https://w3c.github.io/webappsec-csp/#should-block-navigation-request specifies "navigation", used for `javascript:` urls
    // https://w3c.github.io/webappsec-csp/#effective-directive-for-inline-check
    private enum InlineType {

        Script(FetchDirectiveKind.ScriptSrcElem), ScriptAttribute(FetchDirectiveKind.ScriptSrcAttr), Style(FetchDirectiveKind.StyleSrcElem), StyleAttribute(FetchDirectiveKind.StyleSrcAttr), Navigation(FetchDirectiveKind.ScriptSrcElem);

        final FetchDirectiveKind effectiveDirective;

        InlineType(FetchDirectiveKind effectiveDirective) {
            this.effectiveDirective = effectiveDirective;
        }
    }

    // Note: this assumes the element is nonceable. See https://w3c.github.io/webappsec-csp/#is-element-nonceable
    // https://w3c.github.io/webappsec-csp/#match-element-to-source-list
    private boolean doesElementMatchSourceListForTypeAndSource(InlineType type, Optional<String> nonce, Optional<String> source, Optional<Boolean> parserInserted) {
        SourceExpressionDirective directive = getGoverningDirectiveForEffectiveDirective(type.effectiveDirective).orElse(null);
        if (directive == null) {
            return true;
        }
        // https://w3c.github.io/webappsec-csp/#allow-all-inline
        boolean allowAllInline = directive.getNonces().isEmpty() && directive.getHashes().isEmpty() && !((type == InlineType.Script || type == InlineType.ScriptAttribute || type == InlineType.Navigation) && directive.strictDynamic()) && directive.unsafeInline();
        if (allowAllInline) {
            return true;
        }
        if (nonce.isPresent()) {
            String actualNonce = nonce.get();
            if (actualNonce.length() > 0 && directive.getNonces().stream().anyMatch(n -> n.base64ValuePart.equals(actualNonce))) {
                return true;
            }
        }
        if (source.isPresent() && !directive.getHashes().isEmpty() && (type == InlineType.Script || type == InlineType.Style || directive.unsafeHashes())) {
            byte[] actualSource = source.get().getBytes(StandardCharsets.UTF_8);
            Base64.Encoder base64encoder = Base64.getEncoder();
            String actualSha256 = null;
            String actualSha384 = null;
            String actualSha512 = null;
            try {
                for (Hash hash : directive.getHashes()) {
                    switch(hash.algorithm) {
                        case SHA256:
                            if (actualSha256 == null) {
                                actualSha256 = base64encoder.encodeToString(MessageDigest.getInstance("SHA-256").digest(actualSource));
                            }
                            if (actualSha256.equals(normalizeBase64Url(hash.base64ValuePart))) {
                                return true;
                            }
                            break;
                        case SHA384:
                            if (actualSha384 == null) {
                                actualSha384 = base64encoder.encodeToString(MessageDigest.getInstance("SHA-384").digest(actualSource));
                            }
                            if (actualSha384.equals(normalizeBase64Url(hash.base64ValuePart))) {
                                return true;
                            }
                            break;
                        case SHA512:
                            if (actualSha512 == null) {
                                actualSha512 = base64encoder.encodeToString(MessageDigest.getInstance("SHA-512").digest(actualSource));
                            }
                            if (actualSha512.equals(normalizeBase64Url(hash.base64ValuePart))) {
                                return true;
                            }
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown hash algorithm " + hash.algorithm);
                    }
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        // This is not per spec, but matches implementations and the spec author's intent: https://github.com/w3c/webappsec-csp/issues/426
        if (type == InlineType.Script && directive.strictDynamic() && !parserInserted.orElse(true)) {
            return true;
        }
        return false;
    }

    private static String normalizeBase64Url(String input) {
        return input.replace('-', '+').replace('_', '/');
    }

    // https://w3c.github.io/webappsec-csp/#match-url-to-source-list
    public static boolean doesUrlMatchSourceListInOrigin(URLWithScheme url, HostSourceDirective list, Optional<URLWithScheme> origin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // https://w3c.github.io/webappsec-csp/#scheme-part-match
    private static boolean schemePartMatches(String A, String B) {
        // Assumes inputs are already lowcased
        return A.equals(B) || A.equals("http") && B.equals("https") || A.equals("ws") && (B.equals("wss") || B.equals("http") || B.equals("https")) || A.equals("wss") && B.equals("https");
    }

    // https://w3c.github.io/webappsec-csp/#host-part-match
    private static boolean hostPartMatches(String A, String B) {
        if (A.startsWith("*")) {
            String remaining = A.substring(1);
            return B.toLowerCase(Locale.ENGLISH).endsWith(remaining.toLowerCase(Locale.ENGLISH));
        }
        if (!A.equalsIgnoreCase(B)) {
            return false;
        }
        Matcher IPv4Matcher = Constants.IPv4address.matcher(A);
        Matcher IPv6Matcher = Constants.IPv6addressWithOptionalBracket.matcher(A);
        Matcher IPv6LoopbackMatcher = Constants.IPV6loopback.matcher(A);
        if ((IPv4Matcher.find() && !A.equals("127.0.0.1")) || IPv6Matcher.find() || IPv6LoopbackMatcher.find()) {
            return false;
        }
        return true;
    }

    // https://w3c.github.io/webappsec-csp/#port-part-matches
    private static boolean portPartMatches(int A, int portB, String schemeB) {
        if (A == Constants.EMPTY_PORT) {
            return portB == URI.defaultPortForProtocol(schemeB);
        }
        if (A == Constants.WILDCARD_PORT) {
            return true;
        }
        if (A == portB) {
            return true;
        }
        if (portB == Constants.EMPTY_PORT) {
            return A == URI.defaultPortForProtocol(schemeB);
        }
        return false;
    }

    // https://w3c.github.io/webappsec-csp/#path-part-match
    private static boolean pathPartMatches(String pathA, String pathB) {
        if (pathA == null)
            pathA = "";
        if (pathB == null)
            pathB = "";
        if (pathA.isEmpty()) {
            return true;
        }
        if (pathA.equals("/") && pathB.isEmpty()) {
            return true;
        }
        boolean exactMatch = !pathA.endsWith("/");
        List<String> pathListA = Utils.strictlySplit(pathA, '/');
        List<String> pathListB = Utils.strictlySplit(pathB, '/');
        if (pathListA.size() > pathListB.size()) {
            return false;
        }
        if (exactMatch && pathListA.size() != pathListB.size()) {
            return false;
        }
        if (!exactMatch) {
            pathListA.remove(pathListA.size() - 1);
        }
        Iterator<String> it1 = pathListA.iterator();
        Iterator<String> it2 = pathListB.iterator();
        while (it1.hasNext()) {
            String a = Utils.decodeString(it1.next());
            String b = Utils.decodeString(it2.next());
            if (!a.equals(b)) {
                return false;
            }
        }
        return true;
    }

    // Utilities and helper classes
    static void enforceAscii(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String stripLeadingWhitespace(String string) {
        return string.replaceFirst("^[" + Constants.WHITESPACE_CHARS + "]+", "");
    }

    private static String stripTrailingWhitespace(String string) {
        return string.replaceAll("[" + Constants.WHITESPACE_CHARS + "]+$", "");
    }

    private static boolean containsLeadingWhitespace(String string) {
        Matcher matcher = Pattern.compile("[" + Constants.WHITESPACE_CHARS + "]+").matcher(string);
        return matcher.find() && matcher.start() == 0;
    }

    @Nonnull
    private static String collect(String input, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(input);
        if (!matcher.find() || matcher.start() != 0) {
            return "";
        }
        return input.substring(0, matcher.end());
    }

    private static class NamedDirective {

        final String name;

        final Directive directive;

        final String lowcaseName;

        private NamedDirective(String name, Directive directive) {
            this.name = name;
            this.directive = directive;
            this.lowcaseName = this.name.toLowerCase(Locale.ENGLISH);
        }
    }

    // Info: strictly informative
    // Warning: it matches the grammar, but is meaningless, duplicated, or otherwise problematic
    // Error: it does not match the grammar
    public enum Severity {

        Info, Warning, Error
    }

    @FunctionalInterface
    public interface PolicyErrorConsumer {

        // valueIndex = -1 for errors not pertaining to a value
        void add(Severity severity, String message, int directiveIndex, int valueIndex);

        PolicyErrorConsumer ignored = (severity, message, directiveIndex, valueIndex) -> {
        };
    }

    @FunctionalInterface
    public interface PolicyListErrorConsumer {

        // valueIndex = -1 for errors not pertaining to a value
        void add(Severity severity, String message, int policyIndex, int directiveIndex, int valueIndex);

        PolicyListErrorConsumer ignored = (severity, message, policyIndex, directiveIndex, valueIndex) -> {
        };
    }
}

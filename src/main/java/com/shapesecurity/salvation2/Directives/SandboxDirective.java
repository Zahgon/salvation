package com.shapesecurity.salvation2.Directives;

import com.shapesecurity.salvation2.Directive;
import com.shapesecurity.salvation2.Policy;
import java.util.List;
import java.util.Locale;

public class SandboxDirective extends Directive {

    private static final String ALLOW_DOWNLOADS = "allow-downloads";

    private boolean allowDownloads = false;

    private boolean allowForms = false;

    private boolean allowModals = false;

    private boolean allowOrientationLock = false;

    private boolean allowPointerLock = false;

    private boolean allowPopups = false;

    private boolean allowPopupsToEscapeSandbox = false;

    private boolean allowPresentation = false;

    private boolean allowSameOrigin = false;

    private boolean allowScripts = false;

    private boolean allowStorageAccessByUserActivation = false;

    private boolean allowTopNavigation = false;

    private boolean allowTopNavigationByUserActivation = false;

    public SandboxDirective(List<String> values, DirectiveErrorConsumer errors) {
        super(values);
        int index = 0;
        for (String token : values) {
            // HTML attribute keywords are ascii-case-insensitive: https://html.spec.whatwg.org/multipage/common-microsyntaxes.html#keywords-and-enumerated-attributes
            String lowcaseToken = token.toLowerCase(Locale.ENGLISH);
            switch(lowcaseToken) {
                case ALLOW_DOWNLOADS:
                    if (!this.allowDownloads) {
                        this.allowDownloads = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-downloads", index);
                    }
                    break;
                case "allow-forms":
                    if (!this.allowForms) {
                        this.allowForms = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-forms", index);
                    }
                    break;
                case "allow-modals":
                    if (!this.allowModals) {
                        this.allowModals = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-modals", index);
                    }
                    break;
                case "allow-orientation-lock":
                    if (!this.allowOrientationLock) {
                        this.allowOrientationLock = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-orientation-lock", index);
                    }
                    break;
                case "allow-pointer-lock":
                    if (!this.allowPointerLock) {
                        this.allowPointerLock = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-pointer-lock", index);
                    }
                    break;
                case "allow-popups":
                    if (!this.allowPopups) {
                        this.allowPopups = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-popups", index);
                    }
                    break;
                case "allow-popups-to-escape-sandbox":
                    if (!this.allowPopupsToEscapeSandbox) {
                        this.allowPopupsToEscapeSandbox = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-popups-to-escape-sandbox", index);
                    }
                    break;
                case "allow-presentation":
                    if (!this.allowPresentation) {
                        this.allowPresentation = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-presentation", index);
                    }
                    break;
                case "allow-same-origin":
                    if (!this.allowSameOrigin) {
                        this.allowSameOrigin = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-same-origin", index);
                    }
                    break;
                case "allow-scripts":
                    if (!this.allowScripts) {
                        this.allowScripts = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-scripts", index);
                    }
                    break;
                case "allow-storage-access-by-user-activation":
                    if (!this.allowStorageAccessByUserActivation) {
                        this.allowStorageAccessByUserActivation = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-storage-access-by-user-activation", index);
                    }
                    break;
                case "allow-top-navigation":
                    if (!this.allowTopNavigation) {
                        this.allowTopNavigation = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-top-navigation", index);
                    }
                    break;
                case "allow-top-navigation-by-user-activation":
                    if (!this.allowTopNavigationByUserActivation) {
                        this.allowTopNavigationByUserActivation = true;
                    } else {
                        errors.add(Policy.Severity.Warning, "Duplicate sandbox keyword allow-top-navigation-by-user-activation", index);
                    }
                    break;
                default:
                    if (token.startsWith("'")) {
                        errors.add(Policy.Severity.Error, "Unrecognized sandbox keyword " + token + " - note that sandbox keywords do not have \"'\"s", index);
                    } else {
                        errors.add(Policy.Severity.Error, "Unrecognized sandbox keyword " + token, index);
                    }
            }
            ++index;
        }
    }

    public boolean allowDownloads() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowDownloads(boolean allowDownloads) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowForms() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowForms(boolean allowForms) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowModals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowModals(boolean allowModals) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowOrientationLock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowOrientationLock(boolean allowOrientationLock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowPointerLock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowPointerLock(boolean allowPointerLock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowPopups() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowPopups(boolean allowPopups) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowPopupsToEscapeSandbox() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowPopupsToEscapeSandbox(boolean allowPopupsToEscapeSandbox) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowPresentation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowPresentation(boolean allowPresentation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowSameOrigin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowSameOrigin(boolean allowSameOrigin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowScripts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowScripts(boolean allowScripts) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowStorageAccessByUserActivation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowStorageAccessByUserActivation(boolean allowStorageAccessByUserActivation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowTopNavigation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowTopNavigation(boolean allowTopNavigation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean allowTopNavigationByUserActivation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowTopNavigationByUserActivation(boolean allowTopNavigationByUserActivation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

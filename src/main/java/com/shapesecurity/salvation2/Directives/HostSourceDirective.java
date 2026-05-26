package com.shapesecurity.salvation2.Directives;

import com.shapesecurity.salvation2.Constants;
import com.shapesecurity.salvation2.Directive;
import com.shapesecurity.salvation2.Policy;
import com.shapesecurity.salvation2.Values.Host;
import com.shapesecurity.salvation2.Values.Scheme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public abstract class HostSourceDirective extends Directive {

    private static final String NONE_SRC = "'none'";

    private static final String SELF_SRC = "'self'";

    protected List<Scheme> schemes = new ArrayList<>();

    protected List<Host> hosts = new ArrayList<>();

    protected boolean star = false;

    protected boolean self = false;

    protected String none = null;

    protected HostSourceDirective(List<String> values) {
        super(values);
    }

    @Override
    protected void addValue(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void removeValueIgnoreCase(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected <T> void removeValuesMatching(T value, Function<String, Optional<T>> parser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void _addHostOrSchemeDuringConstruction(String token, String lowcaseToken, String kind, int index, DirectiveErrorConsumer errors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean _addScheme(Scheme scheme, int index, DirectiveErrorConsumer errors) {
        if (this.schemes.contains(scheme)) {
            errors.add(Policy.Severity.Warning, "Duplicate scheme " + scheme, index);
            return false;
        } else {
            // TODO check if this subsumes or is subsumed by any existing scheme/host
            // NB we add it even if it subsumes or is subsumed by existing things, since it's still valid and not a duplicate
            this.schemes.add(scheme);
            return true;
        }
    }

    private boolean _addHostSource(Host source, int index, DirectiveErrorConsumer errors) {
        if (this.hosts.contains(source)) {
            errors.add(Policy.Severity.Warning, "Duplicate host " + source.toString(), index);
            return false;
        } else {
            // TODO check if this subsumes or is subsumed by any existing scheme/host
            this.hosts.add(source);
            return true;
        }
    }

    public boolean star() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStar(boolean star) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean self() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSelf(boolean self) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Scheme> getSchemes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addScheme(Scheme scheme, ManipulationErrorConsumer errors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean removeScheme(Scheme scheme) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Host> getHosts() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addHost(Host host, ManipulationErrorConsumer errors) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean removeHost(Host host) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

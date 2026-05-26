package com.shapesecurity.salvation2;

import java.util.List;

public class PolicyList {

    public final List<Policy> policies;

    public PolicyList(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package com.shapesecurity.salvation2;

import org.teavm.jso.JSBody;

public class JSInterface {

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getErrorsForSerializedCSPList(String policyText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getErrorsForSerializedCSP(String policyText) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JSBody(params = {}, script = "(window || globalThis).getErrorsForSerializedCSPList = (policyText) => {\n" + "return javaMethods.get('com.shapesecurity.salvation2.JSInterface.getErrorsForSerializedCSPList(Ljava/lang/String;)Ljava/lang/String;').invoke(policyText)\n" + "}")
    static native void initParseList();

    @JSBody(params = {}, script = "(window || globalThis).getErrorsForSerializedCSP = (policyText) => {\n" + "return javaMethods.get('com.shapesecurity.salvation2.JSInterface.getErrorsForSerializedCSP(Ljava/lang/String;)Ljava/lang/String;').invoke(policyText)\n" + "}")
    static native void initParseSingle();
}

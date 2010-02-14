package com.xmlcalabash.util;

import net.sf.saxon.StandardErrorListener;

import javax.xml.transform.TransformerException;

/**
 * Created by IntelliJ IDEA.
 * User: ndw
 * Date: Dec 9, 2009
 * Time: 7:13:02 AM
 *
 * The StepErrorListener puts errors on the p:catch error port and passes the error along to the next
 * listener. If you want the next listener to just drop messages on the floor, use this one.
 *
 */
public class SilentErrorListener extends StandardErrorListener {
    public SilentErrorListener() {
        super();
    }

    public void error(TransformerException exception) throws TransformerException {
        // what, me, worry?
    }

    public void fatalError(TransformerException exception) throws TransformerException {
        // what, me, worry?
    }

    public void warning(TransformerException exception) throws TransformerException {
        // what, me, worry?
    }
}
package org.commonmark.parser;

/**
 * Whether to include {@link org.commonmark.node.SourceSpan} or not while parsing,
 * see {@link Parser.Builder#includeSourceSpans(IncludeSourceSpans)}.
 */
public enum IncludeSourceSpans {
    /**
     * Do not include source spans.
     */
    NONE,
    /**
     * Include source spans on {@link org.commonmark.node.Block} nodes.
     */
    BLOCKS,
}

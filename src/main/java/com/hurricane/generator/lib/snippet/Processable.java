package com.hurricane.generator.lib.snippet;

import com.hurricane.generator.lib.snippet.model.*;

public interface Processable {
    SnippetCode process(SourceCodeFile sourceCodeFile);
}

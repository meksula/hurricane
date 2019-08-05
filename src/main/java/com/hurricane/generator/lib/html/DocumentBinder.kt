package com.hurricane.generator.lib.html

import com.hurricane.generator.lib.html.model.BindingProduct
import com.hurricane.generator.lib.html.model.HtmlSheet
import com.hurricane.generator.lib.snippet.model.Snippet

public interface Binder {
    fun bind(snippet: Snippet, sheet: HtmlSheet): BindingProduct
}
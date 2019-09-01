package com.hurricane.generator.ui.dialog

fun factorizeDialog(mode: String): ApplicationDialog {
    val modeExtracted = extractMode(mode)
    if (modeExtracted == "CLI") {
        return CliApplicationDialog()
    }
    return if (modeExtracted == "GUI") {
        GuiApplicationDialog()
    } else CliApplicationDialog()
}

fun extractMode(mode: String): String {
    return mode.split(ApplicationDialog.COMMAND_PREFIX.toUpperCase())[1]
}
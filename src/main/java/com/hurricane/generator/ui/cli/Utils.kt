package com.hurricane.generator.ui.cli

import java.util.*

fun print(value: String) {
    println("---\n$value\n---")
}

val scanner = Scanner(System.`in`)

fun input(label: String): String {
    kotlin.io.print(label)
    return scanner.next()
}
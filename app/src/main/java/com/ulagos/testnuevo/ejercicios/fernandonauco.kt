package com.ulagos.testnuevo.ejercicios

fun main() {
    val inmutable = "soy inmutable"
    var mutable = "soy mutable"

    println("Variable inmutable: $inmutable")
    println("Variable mutable antes de modificar:$mutable")

    mutable = "he cambiado"
    println("variable mutable despues de modificar:$mutable")

}
package com.ulagos.testnuevo.ejercicios

fun main(){

    var numero = 5
    var contador = 0

    while (numero !=0){
    print("Ingrese un número: ")
    numero = readLine()!!.toInt()
        if(numero != 0) contador++

    }
    println("Resultado esperado es: $contador")




}
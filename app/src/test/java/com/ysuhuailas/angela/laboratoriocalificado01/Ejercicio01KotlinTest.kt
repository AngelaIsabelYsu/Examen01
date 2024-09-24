package com.ysuhuailas.angela.laboratoriocalificado01

import org.junit.Test

class Ejercicio01KotlinTest {
    private val ejercicio = Ejercicio01Kotlin()

    @Test
    fun testContarFrecuencia() {
        val palabra = "Banana"

        val resultado = ejercicio.contarFrecuencia(palabra)

        println("Resultado de la palabra   :$resultado")
    }
}
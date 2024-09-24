package com.ysuhuailas.angela.laboratoriocalificado01

class Ejercicio01Kotlin {
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>()

        for (char in palabra) {
            frecuencia[char] = frecuencia.getOrDefault(char, 0) + 1
        }

        return frecuencia
    }
}
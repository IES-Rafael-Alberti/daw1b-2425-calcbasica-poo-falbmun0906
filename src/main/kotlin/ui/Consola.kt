package org.example.ui

import java.util.*

class Consola {

    private val scanner = Scanner(System.`in`)

    fun pedirInfo(mensaje: String): String {
        print(mensaje)
        return scanner.nextLine()
    }

    fun mostrar(mensaje: String) {
        println(mensaje)
    }

    fun mostrarError(error: String) {
        System.err.println("ERROR: $error")
    }

    fun pedirDouble(prompt: String): Double {
        while (true) {
            print(prompt)
            val entrada = readlnOrNull()
            try {
                return entrada?.toDouble() ?: throw NumberFormatException()
            } catch (e: NumberFormatException) {
                println("ERROR: El número introducido no es válido.")
            }
        }
    }

    fun pedirEntero(prompt: String): Int {
        while (true) {
            print(prompt)
            val entrada = readlnOrNull()
            try {
                return entrada?.toInt() ?: throw NumberFormatException()
            } catch (e: NumberFormatException) {
                println("ERROR: El número introducido no es un entero.")
            } catch (e: Exception) {
                println("ERROR: Entrada no válida.")
            }
        }
    }

    fun pedirChar(mensaje: String): Char {
        return pedirInfo(mensaje).firstOrNull() ?: ' '
    }


}
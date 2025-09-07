// filepath: c:\Users\Sora\Documents\TesteEldorado-Richard\TestEldoradoAppKotlin\app\src\test\java\com\halil\ozel\darkmode\CalculadoraTest.kt
package com.halil.ozel.darkmode

import org.junit.Test
import org.junit.Assert.*

class CalculadoraTest {
    @Test
    fun soma_deveRetornarCorreto() {
        val calc = Calculadora()
        assertEquals(5, calc.soma(2, 3))
    }
}

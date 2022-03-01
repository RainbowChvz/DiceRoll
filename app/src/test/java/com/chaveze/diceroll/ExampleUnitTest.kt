package com.chaveze.diceroll

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun generate_numbers() {
        val dice = Dice(6)
        val stored = dice.roll()

        assertTrue("Result value out of range", stored in 1..6)
    }
}
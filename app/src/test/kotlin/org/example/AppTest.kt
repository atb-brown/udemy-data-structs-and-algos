/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = HelloWorld()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}

/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.duanyifu.jlox

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def lox = new Lox()

        expect:
        lox != null
    }
}

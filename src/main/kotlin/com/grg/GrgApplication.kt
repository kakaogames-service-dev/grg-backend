package com.grg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrgApplication

fun main(args: Array<String>) {
    runApplication<GrgApplication>(*args)
}

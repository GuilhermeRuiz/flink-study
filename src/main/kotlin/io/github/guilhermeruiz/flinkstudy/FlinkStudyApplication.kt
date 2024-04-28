package io.github.guilhermeruiz.flinkstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlinkStudyApplication

fun main(args: Array<String>) {
	runApplication<FlinkStudyApplication>(*args)
}

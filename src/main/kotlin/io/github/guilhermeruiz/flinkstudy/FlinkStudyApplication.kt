package io.github.guilhermeruiz.flinkstudy

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class FlinkStudyApplication


fun main(args: Array<String>) {
	runApplication<FlinkStudyApplication>(*args)
}

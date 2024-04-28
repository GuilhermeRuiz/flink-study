package io.github.guilhermeruiz.flinkstudy

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestFlinkStudyApplication

fun main(args: Array<String>) {
	fromApplication<FlinkStudyApplication>().with(TestFlinkStudyApplication::class).run(*args)
}

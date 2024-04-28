package io.github.guilhermeruiz.flinkstudy

import io.github.guilhermeruiz.flinkstudy.config.KafkaContainerConfiguration
import io.github.guilhermeruiz.flinkstudy.config.KafkaContainerConfiguration.Companion.kafka
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Import(KafkaContainerConfiguration::class, KafkaContainerConfiguration.Companion::class )
class FlinkStudyApplicationTests {

	@Test
	fun contextLoads() {
	}

	companion object {
		@DynamicPropertySource
		@JvmStatic
		fun kafkaProperties(registry: DynamicPropertyRegistry) {
			KafkaContainerConfiguration.setKafkaProperties(registry)
		}
	}
}

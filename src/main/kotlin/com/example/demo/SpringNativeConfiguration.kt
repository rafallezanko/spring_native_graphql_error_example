package com.example.demo

import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportRuntimeHints
import org.springframework.core.NativeDetector
import org.springframework.core.io.ClassPathResource
import org.springframework.graphql.execution.GraphQlSource

@Configuration
@ImportRuntimeHints(SpringNativeConfiguration.GraphQLNativeRuntimeHints::class)
internal class SpringNativeConfiguration {
    @Bean
    fun graphQlSourceBuilderCustomizer(): GraphQlSourceBuilderCustomizer =
        GraphQlSourceBuilderCustomizer { schemaResourceBuilder: GraphQlSource.SchemaResourceBuilder ->
            if (NativeDetector.inNativeImage()) {
                schemaResourceBuilder.schemaResources(ClassPathResource("graphql/schema.graphqls"))
            }
        }

    internal class GraphQLNativeRuntimeHints : RuntimeHintsRegistrar {
        override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {
            hints.resources().registerPattern("graphql/schema.graphqls")
        }
    }
}

package com.example.demo

import com.example.demo.dto.CreateExperienceDto
import com.example.demo.dto.CreatedExperienceResponse
import graphql.language.*
import graphql.schema.*
import org.springframework.aot.hint.MemberCategory
import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportRuntimeHints

@Configuration
@ImportRuntimeHints(SpringNativeConfiguration.GraphQLNativeRuntimeHints::class)
internal class SpringNativeConfiguration {
    internal class GraphQLNativeRuntimeHints : RuntimeHintsRegistrar {
        private val values = MemberCategory.values()

        override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {
            hints.resources().registerPattern("graphql/schema.graphqls")

            val reflectionHints = hints.reflection()

            listOf(
                CreateExperienceDto::class.java,
                CreatedExperienceResponse::class.java,
                ExperienceController::class.java
            ).forEach { aClass -> reflectionHints.registerType(aClass) { values } }
        }
    }
}

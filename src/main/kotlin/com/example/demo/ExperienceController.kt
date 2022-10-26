package com.example.demo

import com.example.demo.dto.CreateExperienceDto
import com.example.demo.dto.CreatedExperienceResponse
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Controller
internal class ExperienceController {
    @MutationMapping
    fun createExperience(@Argument input: CreateExperienceDto): Mono<CreatedExperienceResponse> =
        input.toMono()
            .doOnNext {
                println(input)
            }
            .then(Mono.empty())
}

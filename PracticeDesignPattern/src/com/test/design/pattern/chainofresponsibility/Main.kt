package com.test.design.pattern.chainofresponsibility

fun main() {
    val chain = BasicValidationHandler(
        KnownEmailHandler
            (
            JuniorDeveloperFilterlHandler
                (
                AnswerHandler()
            )
        )
    )

    val request = Request("developer@company.com", "Is jenkins working?")
    val response = chain.handle(request)
    println(response.answer)
}
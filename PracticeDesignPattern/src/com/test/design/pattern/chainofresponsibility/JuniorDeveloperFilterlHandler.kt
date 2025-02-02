package com.test.design.pattern.chainofresponsibility

class JuniorDeveloperFilterlHandler(private val next: Handler) : Handler {
    override fun handle(request: Request): Response {
        if (request.email.contains("junior")) {
            throw IllegalArgumentException()
        }
        return next.handle(request)
    }
}
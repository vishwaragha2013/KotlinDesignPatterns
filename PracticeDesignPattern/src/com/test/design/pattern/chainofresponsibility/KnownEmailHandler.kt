package com.test.design.pattern.chainofresponsibility

class KnownEmailHandler(private val next: Handler) : Handler {
    override fun handle(request: Request): Response {
        if (!request.email.contains("company")) {
            throw IllegalArgumentException()
        }
        return next.handle(request)
    }
}